package com.example.base;

/**
 * @author 41127
 */

public enum ReturnType {
    /**
     *
     */
    SUCCESS("1001","成功"),
    /**
     *
     */
    ERROR("1002","失败");

    private final String code;
    private final String msg;

    ReturnType(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return msg;
    }
}
