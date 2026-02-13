package com.linearsearch;

public class EvenNoOfDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int ans = findNumbers(arr);
        System.out.println(ans);
        System.out.println(digits2(56789));

    }
    static int findNumbers(int[] arr){
        int count = 0;//for(i : arr) or
        for (int i = 0; i< arr.length; i++) {
            int j = arr[i];
            if (even(j)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int noofdigits = digits(num);
        if (noofdigits % 2 == 0){
            return true;
        }
        return false;
    }//count the no of digits in a number
    static int digits(int num){
        if(num < 0){
            num = num*-1;
        }
        if(num == 0) return 1;
        int count = 0;
        while(num > 0){
          //  int n = num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }
    //shortcut to find the no of digits
    static int digits2(int num){
        if(num < 0) num = num*-1;
        return (int)(Math.log10(num))+1;
    }
}
