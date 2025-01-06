package com.hole.hs.mapper;

import com.hole.hs.domain.RoleDataAuthority;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hole.hs.model.DataAuthorityScopeVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author PC
* @description 针对表【ds_role_data_authority(角色数据权限)】的数据库操作Mapper
* @createDate 2025-01-06 15:18:51
* @Entity com.hole.hs.domain.RoleDataAuthority
*/
public interface RoleDataAuthorityMapper extends BaseMapper<RoleDataAuthority> {

    List<DataAuthorityScopeVO> selectDataScopes(@Param("roleIds") List<Long> roleIds);
}




