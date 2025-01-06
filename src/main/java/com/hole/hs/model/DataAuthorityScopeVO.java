package com.hole.hs.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 数据权限范围
 */
@Data
public class DataAuthorityScopeVO implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private Long createUser;

    /**
     * 修改人
     */
    private Long updateUser;

    /**
     * 删除状态
     */
    private Long deleted;

    /**
     * 状态
     */
    private Long statusof;

    /**
     * 备注
     */
    private String comments;

    /**
     * 表id
     */
    private Long tableId;

    /**
     * 类型
     */
    private String scopeType;

    /**
     * 名称
     */
    private String scopeName;

    /**
     * 排序
     */
    private Integer orderNumber;

    private static final long serialVersionUID = 1L;
}