package com.hole.hs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 数据权限范围
 * @TableName ds_data_authority_scope
 */
@TableName(value ="ds_data_authority_scope")
@Data
public class DataAuthorityScope implements Serializable {
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
     * 表id
     */
    @TableField(value = "table_id")
    private Long tableId;

    /**
     * 类型
     */
    @TableField(value = "scope_type")
    private String scopeType;

    /**
     * 名称
     */
    @TableField(value = "scope_name")
    private String scopeName;

    /**
     * 排序
     */
    @TableField(value = "order_number")
    private Integer orderNumber;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}