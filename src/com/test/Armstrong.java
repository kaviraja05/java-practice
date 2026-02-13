package com.test;

public class Armstrong {
    public static void main(String[] args) {
        for(int i = 100; i <= 1000; i++) {
            if(armstrong(i)){
            System.out.println(i);}
        }
    }
    public static boolean armstrong(int num){
        int sum = 0;
        int original = num;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem * rem * rem;
            num = num / 10;
        }
        if(original == sum) {return true;}
        else {return false;}
        }
    }
