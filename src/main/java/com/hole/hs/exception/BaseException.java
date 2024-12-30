package com.hole.hs.exception;

public class BaseException extends RuntimeException {
    private static final long serialVersionUID = -5394065285026414996L;

    private String message;

    private String resultCode;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(String resultCode, String message) {
        super(String.format("%s : %s", resultCode, message));
        setMessage(message);
        setResultCode(resultCode);
    }

    public BaseException(String resultCode, String message, Throwable cause) {
        super(message, cause);
        setMessage(message);
        setResultCode(resultCode);
    }

    public BaseException() {
    }
}
