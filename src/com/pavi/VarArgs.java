package com.pavi;

import java.util.Arrays;
import java.util.Scanner;

//Varuable Arguments: when you create a method that takes a variable no. of arguments

public class VarArgs {
    public static void main(String[] args) {
        fun();
        fun(6,7,8,4,3,2,4,5,5,6,7,5);
        demo(2,4,"kavi", "yuva", "shiva");
        demo(1,2,3,4,5,6);
        demo("kavi", "kani", "shakshi");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
        System.out.println(a);
    }

    //overloading in VarArgs
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    //you must pass parameters inside the brackets, because the VarArgs parameter cannot be empty in this case because,  at the compile time, it will not able to decide what to run.
// this is Ambuiguity
}
