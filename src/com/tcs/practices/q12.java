/*
Input :
7  -> Value of N
[1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input each element is separated by new line.

Output :
0 0 0 1 1 2 2  -> Element after sorting based on risk severity
 */

package com.tcs.practices;
import java.util.*;
public class q12 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int  i = 0; i < n; i++){
           arr[i] = sc.nextInt();
       }
       int low = 0, mid = 0, high = n - 1;
       while(mid <= high){
           if(arr[mid] == 0) {
               int temp = arr[low];
               arr[low] = arr[mid];
               arr[mid] = temp;
               low++;
               mid++;
           }
           else if(arr[mid] == 1){
               mid++;
           }
           else{
               int temp = arr[high];
               arr[high] = arr[mid];
               arr[mid] = temp;
               high--;
           }
       }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
