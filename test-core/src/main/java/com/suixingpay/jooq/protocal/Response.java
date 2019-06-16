package com.suixingpay.jooq.protocal;

import com.suixingpay.jooq.exception.ErrMsg;
import lombok.Data;

@Data
public class Response<T> {

    private static final int SUCCESS = 0;
    private static final String SUCCESS_MSG = "ok";

    private int code = SUCCESS;

    private String msg = SUCCESS_MSG;

    private T data;

    public static <T> Response<T> ok() {

        Response<T> response = new Response<>();

        response.data = null;

        return response;

    }

    public static <T> Response<T> ok(T data) {

        Response<T> response = new Response<>();

        response.data = data;

        return response;

    }

    public static <T> Response<T> error(int code, String msg) {

        Response<T> response = new Response<>();
        response.code = code;
        response.msg = msg;
        response.data = null;

        return response;

    }

    public static <T> Response<T> error(int code) {

        Response<T> response = new Response<>();
        response.code = code;
        response.msg = ErrMsg.errMsg(code);
        response.data = null;

        return response;

    }

}
