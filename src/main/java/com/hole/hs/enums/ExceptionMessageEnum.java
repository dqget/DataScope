package com.hole.hs.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ExceptionMessageEnum {
    ACCOUNT_OR_PASSWORD_ERROR("LOGIN_01", "账号或密码错误不存在"),

    PASSWORD_ERROR("LOGIN_02", "账号密码错误"),

    ;


    private final String value;
    private final String desc;
}
