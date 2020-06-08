package org.demo.dto.base;

import java.io.Serializable;

/**
 * Created by jiangbin on 2018/12/17.
 */
public class BaseResponse<T> implements Serializable {

    private String status;

    private String code;
    private T data;

    private String message;

    private String msg;

    private Long serverTime=System.currentTimeMillis();

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getServerTime() {
        return serverTime;
    }

    public void setServerTime(Long serverTime) {
        this.serverTime = serverTime;
    }

    public BaseResponse(String status, String code, T data, String message) {
        this.status = status;
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse() {
    }
}