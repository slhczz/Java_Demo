package com.homework.homework1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Homework1 {

    public static void main(String[] args) {
        Car c1 = new Car("奥拓",100);
        Car c2 = new Car("宝马",200);
        Car c3 = new Car("奔驰",300);

        Map<Car,String> m1 = new HashMap<>();

        m1.put(c1,"10000");
        m1.put(c2,"500000");
        m1.put(c3,"2000000");

        Set<Car> keyset = m1.keySet();
//遍历m1 打印 name
        for (Car c:keyset ) {
            System.out.println("name: " + c.getName());
        }
//        m1中宝马的价格
        for (Car c:keyset ) {
            if("宝马".equals(c.getName())){
                System.out.println(m1.get(c));
            }
        }
//降速后宝马的速度
        for (Car c:keyset ) {
            int newSpeed = (int) (c.getSpeed() * 0.8);
            c.setSpeed(newSpeed);
            if("宝马".equals(c.getName())){
                System.out.println(c.getSpeed());
            }
        }
//所有车降速的速度
         System.out.println("降速后： " + c1.getSpeed());
         System.out.println("降速后： " + c2.getSpeed());
         System.out.println("降速后： " + c3.getSpeed());
    }

}
