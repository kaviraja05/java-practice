package com.kavi;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);      //Automatic type conversion will be occured bcoz, float>int
        //when you are giving int as an input and in the output section, giving the value of float, then it will show error

        //then how could we convert int to float, here TYPE CASTING takes place
        int number = (int)(67.56f);
        System.out.println(number);

        //Automatic TYPE PROMOTION
     //   int a1=258;
     //   byte b1=(byte)(a1);       //type casting
     //   System.out.println(b1);    // the output will be 2, bcoz the max value to be stored in byte will be 256, the rem 2 is the ans


        //byte a=40;
      //  byte b=50;
      //  byte c=100;
     //   int d=(a*b)/c;
      //  System.out.println(d);

        //Type conversion
        int n='a';
        System.out.println(n);

        byte b=42;
        char c='a';
        short s=1024;
        int i=50000;
        float f=5.67f;
        double d=0.1234;
        double result=(f*b)+(i/c)-(d-s);
        System.out.println((f*b)+" "+(i/c)+" "+(d-s) );   //(float>byte) (int>char) (double>short)
                                                         // double>float>int=double(the ans will be in double format
        System.out.println(result);
    }
}
