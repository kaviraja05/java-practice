package com.practice;
// reverse an array without using extra spaces

import java.util.Arrays;
public class practice3 {
    public static void main(String[] args) {
        String str = "Hello Arjun!";
        char[] str1 = str.toCharArray();
        reverse(str1);
        System.out.println(Arrays.toString(str1));
    }
    static void reverse(char[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            if(arr[start] == ' ') start++;
            else if(arr[end] == ' ') end--;
            else{
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }

}
