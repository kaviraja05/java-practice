package com.pavi;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,4,7,43,76};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] num){
        num[0]=99;
        System.out.println(Arrays.toString(num));
    }
}
