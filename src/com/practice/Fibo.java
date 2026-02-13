package com.practice;

public class Fibo {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        System.out.print(a + " "+ b+ " ");
        for (int i = 2; i < 10; i++) {
            int temp = b;
            b = a+b;
            a = temp;
            System.out.print(b+ " ");
        }
    }
}
