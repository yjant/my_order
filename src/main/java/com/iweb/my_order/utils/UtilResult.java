package com.iweb.my_order.utils;

public class UtilResult {
    private String message;
    private Boolean isOK;
    private Object data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getOK() {
        return isOK;
    }

    public void setOK(Boolean OK) {
        isOK = OK;
    }

    public <T> T getData() {
        return (T)data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
