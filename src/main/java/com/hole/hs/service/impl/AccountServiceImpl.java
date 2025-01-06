package com.hole.hs.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hole.hs.cons.Cons;
import com.hole.hs.domain.Account;
import com.hole.hs.domain.Role;
import com.hole.hs.enums.ExceptionMessageEnum;
import com.hole.hs.exception.ServiceException;
import com.hole.hs.mapper.AccountMapper;
import com.hole.hs.mapper.RoleMapper;
import com.hole.hs.model.AccountVO;
import com.hole.hs.model.DataAuthorityScopeVO;
import com.hole.hs.service.AccountService;
import com.hole.hs.service.RoleDataAuthorityService;
import com.hole.hs.utils.BeanMapperUtils;
import com.hole.hs.utils.CacheUtils;
import org.dromara.hutool.core.map.MapUtil;
import org.dromara.hutool.json.JSONUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author PC
 * @description 针对表【ds_account(账户表)】的数据库操作Service实现
 * @createDate 2024-12-30 16:26:21
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

    @Resource
    private RoleMapper roleMapper;

    @Resource
    private RoleDataAuthorityService roleDataAuthorityService;

    @Override
    public AccountVO login(AccountVO inputAccount) {
        String userAccount = inputAccount.getUserAccount();
        String userPassword = inputAccount.getUserPassword();

        Account account = baseMapper.selectOne(Wrappers.<Account>lambdaQuery()
                .eq(Account::getUserAccount, userAccount)
                .eq(Account::getUserPassword, userPassword)
                .eq(Account::getDeleted, 0L));
        if (Objects.isNull(account)) {
            throw new ServiceException(ExceptionMessageEnum.ACCOUNT_OR_PASSWORD_ERROR);
        }
        inputAccount.setId(account.getId());

        return BeanMapperUtils.map(account, AccountVO.class);
    }

    @Override
    public AccountVO queryById(Long id) {
        Account entity = getById(id);
        AccountVO account = BeanMapperUtils.map(entity, AccountVO.class);
        List<Role> roles = roleMapper.selectList(Wrappers.<Role>lambdaQuery()
                .inSql(Role::getId, "select role_id from ds_account_role where account_id = '" + id + "'"));
        account.setRoles(roles);
        return account;
    }

    @Override
    public void cache(String token, AccountVO account) {
        AccountVO accountVO = queryById(account.getId());
        // 缓存用户基本信息
        cacheAccountInfo(token, accountVO);
        // 缓存数据权限
        cacheDataAuthority(token, accountVO);
    }

    private void cacheDataAuthority(String token, AccountVO account) {
        List<Role> roles = account.getRoles();
        // 数据权限
        List<Long> roleIds = roles.stream().map(Role::getId).collect(Collectors.toList());
        List<DataAuthorityScopeVO> dataScopes = roleDataAuthorityService.queryDataScopes(roleIds);

    }

    /**
     * 缓存用户基本信息
     *
     * @param token   令牌
     * @param account 账号
     */
    private void cacheAccountInfo(String token, AccountVO account) {
        Map<String, Object> accountMap = MapUtil.newHashMap(8);
        // 缓存用户基本信息
        accountMap.put(Cons.USER_BASE_INFO, JSONUtil.toJsonStr(account));
        CacheUtils.hset(Cons.USER_INFO + token, accountMap);
    }

    @Override
    public void logout() {

    }
}




