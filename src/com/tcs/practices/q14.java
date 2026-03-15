/*
Input :5244 -> Value of N
Output :160 -> Price

Explanation:
From the input above
Product of the digits 5,2,4,4
5*2*4*4= 160
Hence, output is 160.
 */

package com.tcs.practices;
import java.util.*;
public class q14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 1;
        while(n > 0){
            int rem = n % 10;
            res = res * rem;
            n = n / 10;
        }
        System.out.println(res);
    }
}
