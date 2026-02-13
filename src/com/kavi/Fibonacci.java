package com.kavi;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=0;
        int b=1;
        int count = 2;
        while(count<=n){
            int temp = b;
            b = a+b;
            a = temp;
            //         System.out.println(b);
            count++;
            //          System.out.print(b);
        }
        System.out.println(b);

    }
}
