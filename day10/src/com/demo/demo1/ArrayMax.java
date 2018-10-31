package com.demo.demo1;

public class ArrayMax {

    public static void main(String[] args) {
        int[] arr = {5,6,7,2,1};
//        demo1(arr);
//        demo2(arr);


        indexOf(arr,55);

    }

    public static int indexOf(int[] arr,int value){
        //数组中的元素前后交换, 遍历的次数只能是数组长度的一半
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==value) {
                return i;
            }
        }
        return -1;
    }
    public static void demo2(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp;
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int demo1(int[] arr) {

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int demo5(int[] arr,int val){

        int start = 0;
        int end = arr.length;

        int mid;

        while(start <= end){

            mid = (start + end)/2;

            if(arr[mid]>val){
                end = arr.length-1;
            }else if(arr[mid]<val){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

}
