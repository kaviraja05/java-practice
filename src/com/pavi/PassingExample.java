package com.pavi;

public class PassingExample {
    public static void main(String[] args) {
        String name = "Kavi";
        greet(name);
        System.out.println(name);
    }
    static void greet(String naam){
        naam = "Rahul";
        System.out.println(naam);
    }
}
