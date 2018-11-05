package com.homework.homework;

import java.util.ArrayList;
import java.util.Collections;

public class Fz {

    public static void main(String[] args) {
        int val1 = 0;
        int val2 = 2;
        ArrayList list = new ArrayList();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");

        //homework1(val1, val2, list);
        Collections.reverse(list);
        for (Object n : list) {
            System.out.print(n + " ");
        }



    }

    private static void homework1(int val1, int val2, ArrayList list) {
        for(int i = 0;i<list.size();i++){
            if(i==val1){
                Object temp = list.get(i);
               list.set(i,list.get(val2));
               list.set(val2,temp);

            }
        }
        for (int i = 0; i < list.size(); i++) {
             System.out.println(list.get(i));
        }
    }

}
