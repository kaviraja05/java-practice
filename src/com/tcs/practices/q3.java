//str1 = "aabbc"
//output: a -> 2 b -> 2 c -> 1

package com.tcs.practices;
import java.util.*;
public class q3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str1 = sc.next();

       int count = 1;
       for(int i = 0; i < str1.length()-1; i++){
           if(str1.charAt(i) == str1.charAt(i+1)){
               count++;
           }
           else {
               System.out.println(str1.charAt(i) + " -> " + count);
               count = 1;
           }
        }
        System.out.println(str1.charAt(str1.length()-1) + " -> " + count);
    }
}
