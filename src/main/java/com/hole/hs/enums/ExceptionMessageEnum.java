package com.hole.hs.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ExceptionMessageEnum {
    NO_ACCOUNT("LOGIN_01", "账号不存在"),

    PASSWORD_ERROR("LOGIN_02", "账号密码错误"),

    ;


    private final String value;
    private final String desc;
}
