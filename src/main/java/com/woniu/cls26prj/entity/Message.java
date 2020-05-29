package com.woniu.cls26prj.entity;

public class Message {
    private boolean success;
    private String msg;

    public boolean isSuccess() {
        return success;
    }
    public Message() {

    }
    public Message(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
