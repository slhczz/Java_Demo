package com.demo;

public class Sut {

    private String name;
    private int yw;
    private int sx;
    private int yy;

    public Sut(String name,int yw,int sx,int yy) {
        this.name = name;
        this.sx = sx;
        this.yw = yw;
        this.yy = yy;
    }

    public String getName() {
        return name;
    }

    public Sut setName(String name) {
        this.name = name;
        return this;
    }

    public int getYw() {
        return yw;
    }

    public Sut setYw(int yw) {
        this.yw = yw;
        return this;
    }

    public int getSx() {
        return sx;
    }

    public Sut setSx(int sx) {
        this.sx = sx;
        return this;
    }

    public int getYy() {
        return yy;
    }

    public Sut setYy(int yy) {
        this.yy = yy;
        return this;
    }
}
