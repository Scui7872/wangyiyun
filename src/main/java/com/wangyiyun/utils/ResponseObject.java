package com.wangyiyun.utils;

import cn.hutool.db.Entity;

import java.util.List;

/**
*@ClassName TestApi
*@Description  TODO
*@author crj
*Data
*@Version 1.0
**/
public class ResponseObject {
    public Integer code ;
    public String msg;
    public Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
