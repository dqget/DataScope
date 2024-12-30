package com.hole.hs.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 账户表
 */
@Data
public class AccountVO implements Serializable {
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
    private Integer deleted;

    /**
     * 状态
     */
    private Integer statusof;

    /**
     * 备注
     */
    private String comments;

    /**
     * 姓名（真实名称）
     */
    private String accountName;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 头像Url地址
     */
    private String avatar;

    /**
     * 公司
     */
    private Long companyId;

    /**
     * 是否限制账号有效期 0：不限制；1：限制
     */
    private Integer loginLimit;

    /**
     * 有效期结束时间
     */
    private Date allowEndTime;

    /**
     * 人员id
     */
    private Long userId;

    /**
     * 公司默认账号
     */
    private Integer isDefault;

    /**
     * 强制修改密码 0不需要 1需要
     */
    private Integer forceModifyPassword;

    private static final long serialVersionUID = 1L;
}