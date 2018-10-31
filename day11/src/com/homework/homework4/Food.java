package com.homework.homework4;

public class Food {

    public void eat(double monry) {

        if(monry<2){
            try {
                throw new NoSoupException("喝不起汤！！！");
            } catch (NoSoupException e) {
                System.out.println(e.msg);
            }
        }else if(monry<11){
           try {
                throw new NoFoodException("吃不上饭！！！");
            } catch (NoFoodException e) {
                System.out.println(e.msg);
            }
        }

    }

}
