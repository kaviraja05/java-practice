package com.pavi;

import java.util.Scanner;

import static java.lang.System.in;

public class Functions {
    public static void main(String[] args) {
        /* access modifier
        return_type name() {
        //body
        return statement;
        }
         */
        //Q: Take input for 2 No's and print the sum
        int ans = sum(3, 4);
        System.out.println(ans);

    }
//    static void sum(){
//        Scanner in = new Scanner(System.in);
//        int num1 = in.nextInt();
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        System.out.println(sum);
//    }

//    static int sum(){
//        Scanner in = new Scanner(System.in);
//        int num1 = in.nextInt();
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        return sum;
//    }
      static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }

}
