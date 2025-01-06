package com.hole.hs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 数据权限(列)
 * @TableName ds_data_authority_column
 */
@TableName(value ="ds_data_authority_column")
@Data
public class DataAuthorityColumn implements Serializable {
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
     * 数据权限类型id
     */
    @TableField(value = "table_id")
    private Long tableId;

    /**
     * 字段名
     */
    @TableField(value = "column_name")
    private String columnName;

    /**
     * 字段描述
     */
    @TableField(value = "column_desc")
    private String columnDesc;

    /**
     * 数据类型
     */
    @TableField(value = "data_type")
    private Integer dataType;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}