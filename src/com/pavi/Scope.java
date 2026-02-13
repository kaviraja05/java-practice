package com.pavi;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        scope(b);
        listen();

        //Anything initialized outside the block, you can definitely use it inside the block
// Anything initialized inside the block of scope, you can definitely initialize outside the block, but cannot used outside the block
       // System.out.println(num);//error
    }
    static void scope(int num){
        int number = 45;
        System.out.println(number);
        System.out.println(num);
    }
    static void listen(){
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int number = 34;// valid
            System.out.println(number);
            int a = 10; // valid
            System.out.println(a);
        }
      //  System.out.println(i); error
    }
}
