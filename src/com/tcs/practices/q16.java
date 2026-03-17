//check if an array is sorted in ascending order or not
//[1,2,3,4] - True
//[1,3,4,2] - False

package com.tcs.practices;
import java.sql.SQLOutput;
import java.util.*;
public class q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }
}
