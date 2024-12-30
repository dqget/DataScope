package com.hole.hs.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 数据权限范围
 *
 * @author dq
 */
@RequiredArgsConstructor
public enum DataScopeEnum {
    // 全部数据权限
    ALL(DataScopeValueEnum.NONE, "系统全部数据"),

    // 自身公司数据权限
    SELF_DEPT(DataScopeValueEnum.SELF_DEPT_ID, "所属部门数据"),

    // 仅本账号数据权限
    SELF_ACCOUNT_PRODUCE(DataScopeValueEnum.SELF_ACCOUNT_ID, "个人创建数据"),

    // 自定数据权限
    CUSTOM(DataScopeValueEnum.COLUMN_VALUE, "自定义"),
    ;

    @Getter
    private final DataScopeValueEnum scopeValue;
    @Getter
    private final String dataScopeTypeName;

}
