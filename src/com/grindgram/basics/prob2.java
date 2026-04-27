//Input: n = 122
//        Output: 221
//        Explanation: By reversing the digits of number, number will change into 221.
//        Input : n = 200
//        Output: 2
//        Explanation: By reversing the digits of number, number will change into 2.

package com.grindgram.basics;

import java.util.*;

public class prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverseDigits(n));
    }

    public static int reverseDigits(int n) {
        int res = 0;
            while(n > 0){
                int digit = n % 10;
                res = res * 10 + digit;
                n = n / 10;
            }
            return res;

    }
}