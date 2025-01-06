package com.hole.hs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 角色数据权限
 * @TableName ds_role_data_authority
 */
@TableName(value ="ds_role_data_authority")
@Data
public class RoleDataAuthority implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private Long createUser;

    /**
     * 修改人
     */
    @TableField(value = "update_user")
    private Long updateUser;

    /**
     * 删除状态
     */
    @TableField(value = "deleted")
    private Long deleted;

    /**
     * 状态
     */
    @TableField(value = "statusof")
    private Long statusof;

    /**
     * 备注
     */
    @TableField(value = "comments")
    private String comments;

    /**
     * 角色
     */
    @TableField(value = "role_id")
    private Long roleId;

    /**
     * 自定义名称
     */
    @TableField(value = "custom_name")
    private String customName;

    /**
     * 数据权限id
     */
    @TableField(value = "scope_id")
    private Long scopeId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}