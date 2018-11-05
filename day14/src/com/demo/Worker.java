package com.demo;

public class Worker {

    private int dmoney;
    private double dxj;

    public Worker(int dmoney,double dxj){
        this.dmoney = dmoney;
        this.dxj = dxj;
    }

    public int getDmoney() {
        return dmoney;
    }

    public Worker setDmoney(int dmoney) {
        this.dmoney = dmoney;
        return this;
    }

    public double getDxj() {
        return dxj;
    }

    public Worker setDxj(double dxj) {
        this.dxj = dxj;
        return this;
    }
}
