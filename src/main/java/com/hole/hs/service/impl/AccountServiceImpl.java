package com.hole.hs.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hole.hs.cons.Cons;
import com.hole.hs.domain.Account;
import com.hole.hs.enums.ExceptionMessageEnum;
import com.hole.hs.exception.ServiceException;
import com.hole.hs.mapper.AccountMapper;
import com.hole.hs.model.AccountVO;
import com.hole.hs.service.AccountService;
import com.hole.hs.utils.CacheUtils;
import org.dromara.hutool.core.convert.ConvertUtil;
import org.dromara.hutool.core.map.MapUtil;
import org.dromara.hutool.json.JSONUtil;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author PC
 * @description 针对表【ds_account(账户表)】的数据库操作Service实现
 * @createDate 2024-12-30 16:26:21
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {
    @Override
    public AccountVO login(AccountVO inputAccount) {
        String userAccount = inputAccount.getUserAccount();
        String userPassword = inputAccount.getUserPassword();

        Account account = baseMapper.selectOne(Wrappers.<Account>query()
                .eq("user_account", userAccount)
                .eq("deleted", 0L));
        if (Objects.isNull(account)) {
            throw new ServiceException(ExceptionMessageEnum.NO_ACCOUNT);
        }
        inputAccount.setId(account.getId());
        //验证账户密码
        if (!account.getUserPassword().equals(userPassword)) {
            throw new ServiceException(ExceptionMessageEnum.PASSWORD_ERROR);
        }
        return ConvertUtil.convert(AccountVO.class, account);
    }

    @Override
    public void cache(String token, AccountVO account) {
        Account entity = getById(account.getId());
        AccountVO accountVO = ConvertUtil.convert(AccountVO.class, entity);
        // 缓存用户基本信息
        cacheAccountInfo(token,  accountVO);
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

        CacheUtils.hmset(Cons.USER_INFO, accountMap);
    }

    @Override
    public void logout() {

    }
}




