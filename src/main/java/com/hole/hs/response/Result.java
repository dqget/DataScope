package com.hole.hs.response;


import org.dromara.hutool.json.JSONUtil;

public class Result {

    private Integer code;

    private Boolean success = true;

    private String resultCode;

    private String msg;

    private Object data;

    private Result(Builder builder) {
        success = builder.success;
        code = builder.code;
        msg = builder.msg;
        data = builder.data;
        resultCode = builder.resultCode;
    }

    public Integer getCode() {
        return code;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getResultCode() {
        return resultCode;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public static class Builder {
        private Boolean success;

        private final Integer code;
        private String msg;
        private Object data;
        private String resultCode;

        public Builder(Integer code) {
            this.code = code;
        }

        public Builder success(boolean success) {
            this.success = Boolean.valueOf(success);
            return this;
        }

        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        public Builder rows(Object data) {
            this.data = data;
            return this;
        }

        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        public Result build() {
            //System.out.println(this.toString()+"=-=-=-=-=-=-=");
            return new Result(this);
        }
    }

    public String toString() {
        return JSONUtil.toJsonStr(this);
    }

    public Result() {
    }
}
