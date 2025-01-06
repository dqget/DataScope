package com.hole.hs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hole.hs.domain.RoleDataAuthority;
import com.hole.hs.model.DataAuthorityScopeVO;
import com.hole.hs.service.RoleDataAuthorityService;
import com.hole.hs.mapper.RoleDataAuthorityMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author PC
* @description 针对表【ds_role_data_authority(角色数据权限)】的数据库操作Service实现
* @createDate 2025-01-06 15:18:51
*/
@Service
public class RoleDataAuthorityServiceImpl extends ServiceImpl<RoleDataAuthorityMapper, RoleDataAuthority> implements RoleDataAuthorityService{

    @Override
    public List<DataAuthorityScopeVO> queryDataScopes(List<Long> roleIds) {
        return baseMapper.selectDataScopes(roleIds);
    }
}




