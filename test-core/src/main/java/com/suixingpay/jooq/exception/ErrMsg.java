package com.suixingpay.jooq.exception;

import java.util.HashMap;
import java.util.Map;

public class ErrMsg implements ErrorCode {

    private static final Map<Integer, String> ERR_MSG_MAP = new HashMap<>();

    static {

        ERR_MSG_MAP.put(NO_USER_FIND, "用户不存在");

    }


    public static String errMsg(int code) {
        return ERR_MSG_MAP.getOrDefault(code, "");
    }

}
