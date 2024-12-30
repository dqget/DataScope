package com.hole.hs.exception;

import com.hole.hs.enums.ExceptionMessageEnum;

public class ServiceException extends BaseException {
    private static final long serialVersionUID = 3259184099333605839L;

    public ServiceException() {
    }

    public ServiceException(ExceptionMessageEnum message) {
        super(message.getValue(), message.getDesc());
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(String resultCode, String message) {
        super(resultCode, message);
    }

    public ServiceException(String resultCode, String message, Throwable cause) {
        super(resultCode, message, cause);
    }
}
