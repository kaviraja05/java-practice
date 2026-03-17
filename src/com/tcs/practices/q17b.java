//Pair or two sum problem - if the array has duplicates
// [2, 2, 3, 4], target = 4
//output = true

package com.tcs.practices;
import java.util.*;
public class q17b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int  i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        HashSet<String> printed = new HashSet<>();

        for(int i = 0; i < arr.length; i++){

            int complement = target - arr[i];

            if(set.contains(complement)){

                // Avoid duplicate pair printing
                int a = Math.min(arr[i], complement);
                int b = Math.max(arr[i], complement);

                String pair = a + "," + b;

                if(!printed.contains(pair)){
                    System.out.println("Pair: " + a + ", " + b);
                    printed.add(pair);
                }
            }

            set.add(arr[i]);
        }
    }
}
