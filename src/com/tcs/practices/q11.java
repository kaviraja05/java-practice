/*
Input
mon-> input String denoting the start of the month.
13  -> input integer denoting the number of days from the start of the month.

Output :
2    -> number of days within 13 days.

Explanation:
The month start with mon(Monday). So the upcoming sunday will arrive in next 6 days. And then next Sunday in next 7 days and so on.
Now total number of days are 13. It means 6 days to first sunday and then remaining 7 days will end up in another sunday. Total 2 sundays may fall within 13 days.
*/
package com.tcs.practices;
import java.util.*;
public class q11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String[] str1 = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};
        int start = 0;
        for(int i = 0; i < str1.length; i++){
            if(str1[i].equals(str)){
               start = i;
               break;
            }
        }
        int sundayindex = 6;
        int count = 0;
        for(int  i = 0; i < n; i++){
            if((start + i) % 7 == sundayindex){
                count++;
            }
        }
        System.out.println(count);
    }
}
