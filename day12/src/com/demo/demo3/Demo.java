package com.demo.demo3;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
//            homework1();
           // homework3(sc);
//        String str1 = "Adcddkiqooqkdddleef";
//        String str2 = "dd";
//        System.out.println(homework4(str1,str2));

    }

    public static int homework4(String str1, String str2) {
        int count = 0;
        int index;
        //先查，赋值，判断
        while((index=str1.indexOf(str2))!=-1){
            count++;
            str1 = str1.substring(index + str2.length());
        }

        return count;
    }

    private static void homework3(Scanner sc) {
        String str = "";
        while (true){
            System.out.println("键盘录入数值：(0：退出)");
            String num = sc.next();

            if("0".equals(num)){
                break;
            }else{
                str +=num;
            }
        }
        System.out.println("输入的字符串" + str);
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length()/2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        String strr = "";
        for (int i = 0; i < arr.length; i++) {
            strr +=arr[i];
        }
        System.out.println("反转后：" + strr);
        sc.close();
    }


    private static void homework1() {
        String str = "ABCDEabcd123456!@#$%^";
        int chu = 0,chl = 0,num = 0,ath = 0;
        for (int i = 0; i < str.length(); i++) {
            char cha = str.charAt(i);
            if(cha>=65&&cha<=90){
                chu++;
            }else if(cha>=97&&cha<=122){
                chl++;
            }else if(cha>=48&&cha<=57){
                num++;
            }else {
                ath++;
            }
        }

        System.out.println("大写" + chu);
        System.out.println("小写" + chl);
        System.out.println("数字" + num);
        System.out.println("其他" + ath);
    }


}
