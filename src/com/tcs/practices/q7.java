// inpiut: m = 10
//output: All prime numbers from 1 to 10 are 2, 3, 5, 7.

package com.tcs.practices;
import java.util.*;
public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for(int i = 2; i <= m; i++){
            int c = 2;
            while(c*c <= i){
                if(i % c == 0){
                    break;
                }c++;
            }
            if(c*c > i){
                System.out.println(i);
            }
        }
    }
}



