//Input: n = 12
//Output: 2
//Explanation: 1, 2 when both divide 12 leaves remainder 0.
//Input: n = 2446
//Output: 1
//Explanation: Here among 2, 4, 6 only 2 divides 2446 evenly while 4 and 6 do not.

package com.grindgram.basics;
import java.util.*;
public class prob4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(evenlydivides(n));
    }
    public static int evenlydivides(int n){
        int m = n;
        int count = 0;
        while( n > 0){
            int digit = n % 10;
            if(digit != 0 && m % digit == 0){
                count++;
            }
            n = n/10;
        }
        return count;
    }
}
