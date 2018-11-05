package com.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {

    public static void main(String[] args) {

        Collection<String> ss = new ArrayList<>();

        ss.add("aa");
        ss.add("bb");
        ss.add("cc");
        ss.add("dd");
        Iterator<String> st = ss.iterator();

        while (st.hasNext()){
            String str = st.next();
            if("aa".equals(str)){
                st.remove();
                System.out.println(str);
            }
            System.out.println(str);
        }
        System.out.println(ss.size());


    }

}
