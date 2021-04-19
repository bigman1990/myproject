package com.example.base;

public class BaseResponse<T> {
    private T data;
    private String code;
    private String msg;

    public BaseResponse() {
    }

    public BaseResponse(T data, ReturnType returnType) {
        this.data = data;
        this.code = returnType.getCode();
        this.msg = returnType.getMessage();
    }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
