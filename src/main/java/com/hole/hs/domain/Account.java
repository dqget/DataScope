package com.hole.hs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 账户表
 * @TableName ds_account
 */
@TableName(value ="ds_account")
@Data
public class Account implements Serializable {
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
    private Integer deleted;

    /**
     * 状态
     */
    @TableField(value = "statusof")
    private Integer statusof;

    /**
     * 备注
     */
    @TableField(value = "comments")
    private String comments;

    /**
     * 姓名（真实名称）
     */
    @TableField(value = "account_name")
    private String accountName;

    /**
     * 昵称
     */
    @TableField(value = "nick_name")
    private String nickName;

    /**
     * 账号
     */
    @TableField(value = "user_account")
    private String userAccount;

    /**
     * 密码
     */
    @TableField(value = "user_password")
    private String userPassword;

    /**
     * 头像Url地址
     */
    @TableField(value = "avatar")
    private String avatar;

    /**
     * 公司
     */
    @TableField(value = "company_id")
    private Long companyId;

    /**
     * 是否限制账号有效期 0：不限制；1：限制
     */
    @TableField(value = "login_limit")
    private Integer loginLimit;

    /**
     * 有效期结束时间
     */
    @TableField(value = "allow_end_time")
    private Date allowEndTime;

    /**
     * 人员id
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 公司默认账号
     */
    @TableField(value = "is_default")
    private Integer isDefault;

    /**
     * 强制修改密码 0不需要 1需要
     */
    @TableField(value = "force_modify_password")
    private Integer forceModifyPassword;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}