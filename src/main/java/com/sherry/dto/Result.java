package com.sherry.dto;

/**
 * Created by SherryWong on 2016/11/27.
 */

import com.fasterxml.jackson.annotation.JsonView;

/**
 * 封装json对象，所有返回结果都是用它
 */
public class Result {

    @JsonView(Views.Public.class)
    String msg;

    @JsonView(Views.Public.class)
    String code;

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

}
