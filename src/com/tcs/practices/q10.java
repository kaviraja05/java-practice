//Move all zeros to the end of an array without using extra array. Maintain order of nonzero elements
//i/p: [0,1,0,3,12]
//o/p: [1,3,12,0,0]

package com.tcs.practices;
import java.util.*;
public class q10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                arr[count] = arr[i];
                count++;
            }
        }
        for(int i = count; i < n; i++){
            arr[i] = 0;
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
