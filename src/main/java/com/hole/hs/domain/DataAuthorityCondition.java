package com.hole.hs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 数据权限范围条件
 * @TableName ds_data_authority_condition
 */
@TableName(value ="ds_data_authority_condition")
@Data
public class DataAuthorityCondition implements Serializable {
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
     * 状态(1.正常 2.关系表关联)
     */
    @TableField(value = "statusof")
    private Long statusof;

    /**
     * 备注
     */
    @TableField(value = "comments")
    private String comments;

    /**
     * 角色与数据权限关联表id
     */
    @TableField(value = "role_data_auth_id")
    private Long roleDataAuthId;

    /**
     * 角色与数据权限关联表id
     */
    @TableField(value = "scope_id")
    private Long scopeId;

    /**
     * 表id
     */
    @TableField(value = "table_id")
    private Long tableId;

    /**
     * 字段id
     */
    @TableField(value = "column_id")
    private Long columnId;

    /**
     * 关联表信息
     */
    @TableField(value = "relation_json")
    private String relationJson;

    /**
     * 运算符
     */
    @TableField(value = "operator")
    private String operator;

    /**
     * 占位符所放数值，应为属性id(格式:[1,2,3,1])
     */
    @TableField(value = "condition_value")
    private String conditionValue;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}