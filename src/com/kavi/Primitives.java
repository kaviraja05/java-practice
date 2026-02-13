package com.kavi;

import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {
        int rollno=4;           //4 bytes
        char letter='K';
        float mark=20.90f;          //4 bytes
        double largeDecimalValue=4321.567895;        //8 bytes
        long largeIntValue=1234567890L;                 //8 bytes
        boolean check=false;

        System.out.println(check);

        Integer rno=98;               //Integer= Rapper class
        System.out.println(rno);

        Scanner input=new Scanner(System.in);
        int no=input.nextInt();
        System.out.println("your roll no  is "+no);

        int a=234_000_000;      //in java, instead of 234,000,000, we use in this format
        System.out.println(a);
    }
}
