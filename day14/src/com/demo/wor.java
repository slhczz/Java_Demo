package com.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class wor {
    public static void main(String[] args) {

        Collection<Worker> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();

            ((ArrayList<Worker>) list).add(new Worker(a,b));

        Iterator<Worker> it = list.iterator();

    }




    }
}
