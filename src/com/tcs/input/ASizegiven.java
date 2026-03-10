package com.tcs.input;
import java.util.Scanner;
//If the Array Size is given

public class ASizegiven {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        for (int elt = 0; elt < n; elt++)
        for(int elt : arr){
            System.out.print(elt+ " ");
        }
    }

}
