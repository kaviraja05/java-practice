package com.kavi;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of A, B, C : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        //Method 1
//        if(a>b && a>c){
//            System.out.println(a);
//        } else if (b>c) {
//            System.out.println(b);
//        } else{
//            System.out.println(c);
//        }
        //Method 2
//        int max=a;
//        if(b>max){
//            max = b;
//        }
//        if(c>max){
//            max=c;
//        }
//        int max=0;
//        if(a>b){
//            max = a;
//        }else{
//            max = b;
//        }
//        if(c>max){
//            max=c;
//        }
        //int max = Math.max(a,b);
        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);

    }
}
