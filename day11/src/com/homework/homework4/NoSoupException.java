package com.homework.homework4;

public class NoSoupException extends Throwable {
    String msg;
    public NoSoupException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public NoSoupException setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
