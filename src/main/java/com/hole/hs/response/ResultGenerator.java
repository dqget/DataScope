package com.hole.hs.response;

import org.springframework.http.HttpStatus;

public class ResultGenerator {

    public static Result genOkResult() {
        return new Result.Builder(HttpStatus.OK.value()).msg("OK").success(true).build();
    }

    public static Result genOkResult(Object data) {
        Result.Builder builder = new Result.Builder(HttpStatus.OK.value());
        builder.msg(HttpStatus.OK.getReasonPhrase());
        builder.success(true);
        builder.rows(data);
        builder.resultCode(String.valueOf(HttpStatus.OK.value()));
        return builder.build();
    }

    public static Result genOkResult(String msg, Object data) {
        Result.Builder builder = new Result.Builder(HttpStatus.OK.value());
        builder.msg(msg);
        builder.success(true);
        builder.rows(data);
        builder.resultCode(String.valueOf(HttpStatus.OK.value()));
        return builder.build();
    }

    public static Result genFailedResult(Integer code, String msg, String resultCode, Object data) {
        return new Result.Builder(code).msg(msg).resultCode(resultCode).success(false).rows(data).build();
    }

    public static Result genFailedResult(String msg, String resultCode) {
        return genFailedResult(HttpStatus.BAD_REQUEST.value(), msg, resultCode, null);
    }

    public static Result genFailedResult(String msg) {
        return genFailedResult(HttpStatus.BAD_REQUEST.value(), msg, String.valueOf(HttpStatus.BAD_REQUEST.value()), null);

    }


}
