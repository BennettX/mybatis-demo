package com.example.mybatisdemo.model.dto;

import java.io.Serializable;

/**
 * @author xhj
 */
public class DataResult<T> implements Serializable {

    private int retCode = 0;

    private String errMsg;

    private T data;

    public DataResult() {
    }

    public DataResult(int retCode, String errMsg, T data) {
        this.retCode = retCode;
        this.errMsg = errMsg;
        this.data = data;
    }

    public static DataResult of(String data) {
        return new DataResult<>(0, null, data);
    }

    public int getRetCode() {
        return retCode;
    }

    public void setRetCode(int retCode) {
        this.retCode = retCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
