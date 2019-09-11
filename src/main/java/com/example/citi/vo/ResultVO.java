package com.example.citi.vo;


import java.io.Serializable;

public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = -9011160745411066739L;
    private String code;
    private String msg;
    private T result;

    public ResultVO() {
    }

    public ResultVO(String code, String msg, T result) {
        this.code = code;
        this.msg = msg;
        this.result = result;
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

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
