package com.hole.hs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 部门
 * @TableName ds_department
 */
@TableName(value ="ds_department")
@Data
public class Department implements Serializable {
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
     * 删除状态(1:已删除;0:未删除)
     */
    @TableField(value = "deleted")
    private Long deleted;

    /**
     * 状态 状态 1正常显示 0隐藏
     */
    @TableField(value = "statusof")
    private Long statusof;

    /**
     * 备注
     */
    @TableField(value = "comments")
    private String comments;

    /**
     * 组织名称
     */
    @TableField(value = "dept_name")
    private String deptName;

    /**
     * 组织编码
     */
    @TableField(value = "dept_code")
    private String deptCode;

    /**
     * 组织类型
     */
    @TableField(value = "dept_type")
    private Long deptType;

    /**
     * 负责人id
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 父id
     */
    @TableField(value = "pid")
    private Long pid;

    /**
     * 排序
     */
    @TableField(value = "order_number")
    private Long orderNumber;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}