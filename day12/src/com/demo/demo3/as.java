package com.demo.demo3;

public class as {
    public static void main(String[] args) {
        String s1 = "alkAsajslkf";

        byte[] bs = s1.getBytes();

        for (int i = 0; i < bs.length; i++) {
            System.out.print(bs[i]+" ");
        }

        System.out.println();

        char[] chs = s1.toCharArray();

        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i]+" ");
        }

        String s2 = String.valueOf(chs);
        System.out.println(s2);

        String s4 = s1.toLowerCase();
        String s5 = s1.toUpperCase();

        System.out.println(s4);
        System.out.println(s5);

        String s6 = "abc";
        String s7 = "def";

        String s8 = s6.concat(s7);
        System.out.println(s8);

        String s9 = "abcdlkjelf";

        String s10 = s9.substring(0,1).toUpperCase().concat(s9.substring(1).toLowerCase());
        System.out.println(s10);
    }
}
