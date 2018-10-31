package com.homework.homework4;

public class NoFoodException extends Exception {

    String msg;

    public NoFoodException(String msg){
       this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public NoFoodException setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
