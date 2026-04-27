//You are given two integer numbers in the form of string, the base a and the index b. You have to find the last digit of ab.
//        Examples:
//        Input: a = "3", b = "10"
//        Output: 9
//        Explanation: 310 = 59049. Last digit is 9.
package com.grindgram.basics;
import java .util.*;

public class prob1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(getLastDigit(a,b));
    }
    static int getLastDigit(String a, String b) {
        if(b.equals("0")){
            return 1;
        }

        int lastdigit = a.charAt(a.length()-1) - '0';

        int exp = 0;
        int len = b.length();
        if(len == 1){
            exp = b.charAt(0) - '0';
        }
        else{
            exp = (b.charAt(len-2) - '0')*10 + (b.charAt(len - 1) - '0');
        }
        exp = exp % 4;
        if(exp == 0) exp = 4;

        int res = 1;
        for(int i = 0; i < exp; i++){
            res *= lastdigit;
        }
return res % 10;
    }
}
