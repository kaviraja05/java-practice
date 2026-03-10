// {2,2,3,4,5}. remove duplicate and print that number

package com.tcs.practices;
public class q6 {
    public static void main(String[] args) {
        int[] arr = {2,2,3,4,4,5,5};
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i + 1]){
                System.out.println(arr[i]);
            }

        }
    }
}
