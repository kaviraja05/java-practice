package com.pavi;

import java.util.Arrays;

//OverLoading in Functions: When two or more functions have the same name, same return type, but different arguments
public class Overloading {
    public static void main(String[] args) {
        fun(54);
        int ans = fun(2,3);
        System.out.println(ans);
        int result = fun(56,45,33);
        System.out.println(result);
        fun("Arjun");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static int fun(int a, int b){
        return a+b;
    }
    static int fun(int a, int b, int c){
        return a+b+c;
    }
    static void fun(String name){
        System.out.println(name);
    }
}
