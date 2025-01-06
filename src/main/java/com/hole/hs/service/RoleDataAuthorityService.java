package com.hole.hs.service;

import com.hole.hs.domain.RoleDataAuthority;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hole.hs.model.DataAuthorityScopeVO;

import java.util.List;

/**
* @author PC
* @description 针对表【ds_role_data_authority(角色数据权限)】的数据库操作Service
* @createDate 2025-01-06 15:18:51
*/
public interface RoleDataAuthorityService extends IService<RoleDataAuthority> {

    List<DataAuthorityScopeVO> queryDataScopes(List<Long> roleIds);
}
