//Sliding window concept
// input: abciiicdefade; k = 3; count the max vowels in the substring
//output: 3

package com.tcs.practices;
import java.util.*;
public class q18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int maxCount = 0;
        int count = 0;
        //Step 1: first window
        for(int i = 0; i < n; i++){
            if(isVowel(str.charAt(i))){
                count++;
            }
        }
        maxCount = count;
        //step 2: Slide the window
        for(int  i = n; i < str.length(); i++){
            if(isVowel(str.charAt(i - n))){
                count--;
            }
            if(isVowel(str.charAt(i))){
                count++;
            }
            maxCount = Math.max(maxCount, count);
        }
        System.out.println(maxCount);

    }
    static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
