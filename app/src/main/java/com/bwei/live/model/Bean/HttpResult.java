package com.bwei.live.model.Bean;

/**
 * Created by zhang on 2017/2/20.
 */

public class HttpResult<T> {
    public int error_code;
    public String reason;
    public T result;

    public int getCode() {
        return error_code;
    }

    public String getReason() {
        return reason;
    }

    public T getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "HttpResult{"+"status='"+reason+"\'"+"' data="+result+"}";
    }
}
