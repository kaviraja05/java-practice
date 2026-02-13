package com.test;

public class Reverse_String {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reversed(str));
    }
    public static String reversed(String n){
        char[] arr = n.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    return new String(arr);
    }

//    public class Reverse_String {
//        public static void main(String[] args) {
//            String str = "Hello";
//            System.out.println(reverse(str));
//        }
//
//        public static String reverse(String s) {
//            return new StringBuilder(s).reverse().toString();
//        }
//    }

}
