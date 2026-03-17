/*
Example 1:
Input : bbbaaababa -> Value of str
 3 -> Value of L

Output:
3   -> Maximum number of a’s

Explanation:
From the input given above.
Dividing the string into sets of 3 characters each
Set 1: {b,b,b}
Set 2: {a,a,a}
Set 3: {b,a,b}
Set 4: {a} -> leftover characters also as taken as another set
Among all the sets, Set 2 has more number of a’s. The number of a’s in set 2 is 3.
Hence, the output is 3.

Example 2:
Input : abbbaabbb -> Value of str
5   -> Value of L

Output:
2   -> Maximum number of a’s

Explanation:
From the input given above,
Dividing the string into sets of 5 characters each.
Set 1: {a,b,b,b,b}
Set 2: {a,a,b,b,b}
Among both the sets, set 2 has more number of a’s. The number of a’s in set 2 is 2.
Hence, the output is 2.

Constraints:
1<=L<=10
1<=N<=50
The input format for testing
The candidate has to write the code to accept two inputs separated by a new line.
First input- Accept string that contains character a and b only
Second input- Accept value for N(Positive integer number)
The output  format for testing
The output should be a positive integer number of print the message(if any) given in the problem statement.(Check the output in Example 1, Example 2).
 */


package com.tcs.practices;
import java.util.*;
public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.nextLine();
        int L = sc.nextInt();

        int maxCount = 0;
        for(int i = 0; i < str.length(); i = i+L){
            int count = 0;
            for(int  j = i; j < i+L && j < str.length(); j++){
                if(str.charAt(j) == 'a') {
                    count++;
                }
            }
            maxCount = Math.max(maxCount, count);
        }
        System.out.println(maxCount);
    }
}














