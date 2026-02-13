package com.pavi;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String hl = greeting(in.next());
        System.out.println(hl);
    }
//    static void greeting(){
//        System.out.println("Hello Kavi!");
//    }

    static String greeting(String name){
        String message = "Hello" +" "+ name;
        return message;
    }
}
