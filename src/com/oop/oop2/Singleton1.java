package com.oop.oop2;

public class Singleton1 {
    public static void main(String[] args) {
        Singleton obj2 = Singleton.getInstance();
        Singleton obj4 = Singleton.getInstance();
        Singleton obj5 = Singleton.getInstance();
        System.out.println(obj2);
        System.out.println(obj5);

        //all three ref variables are just pointing to the one object
    }
}
