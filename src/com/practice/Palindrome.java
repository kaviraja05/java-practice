package com.practice;

public class Palindrome {
    public static void main(StringEg[] args) {
        int num = -121;
        System.out.println(isPalindrome(num));
    }
    public static boolean isPalindrome(int num){
        if(num < 0){
            return false;
        }
        int sum = 0;
        int temp = num;
        while(num > 0) {
            int rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        if(sum == temp) return true;
        return false;
    }
}
