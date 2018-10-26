package com.demo.demo5;

public class MainCar {

    public static void main(String[] args) {

        SmallCar sc = new SmallCar();
        sc.run();
        sc.tool();

        BigCar bc = new BigCar();
        bc.run();
        bc.tool();

    }


}
