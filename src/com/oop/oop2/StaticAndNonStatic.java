package com.oop.oop2;

public class StaticAndNonStatic {
    public static void main(String[] args) {
        fun();
        //greeting();
    }

    static void fun(){
        StaticAndNonStatic obj = new StaticAndNonStatic();
        obj.greeting();
        obj.fun2();
    }

     void fun2(){
        greeting();
    }
     void greeting(){
        System.out.println("Hello Arjun!");
    }
}
