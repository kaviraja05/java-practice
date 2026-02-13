package com.practice;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = isEven(num);
        System.out.println(ans);
        sc.close();
    }
    public static boolean isEven(int num){
        if(num % 2 == 0) return true;
        return false;
    }
}
