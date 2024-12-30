package com.hole.hs.enums;

/**
 * scope 表的status字段枚举
 *
 * @author dq
 */
public enum DataScopeMapSourceEnum {
    // 正常
    NORMAL(1),

    // 从关系表中获取
    RELATION(2);
    private final Integer status;

    DataScopeMapSourceEnum(int status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }
}