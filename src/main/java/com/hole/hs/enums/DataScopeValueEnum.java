package com.hole.hs.enums;

import lombok.Getter;

/**
 * @author dq
 */
public enum DataScopeValueEnum {
    // scope取值
    SELF_ACCOUNT_ID(1),

    SELF_USER_ID(2),

    SELF_DEPT_ID(3),

    COLUMN_VALUE(997),

    COLUMN_VALUE_TYPE(998),

    NONE(999),
    ;

    DataScopeValueEnum(int value) {
        this.value = value;
    }
    @Getter
    private final int value;
}
