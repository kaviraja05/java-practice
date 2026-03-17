//Pair or two sum problem
// arr[] = [0, -1, 2, -3, 1], target = -2
//output = true

package com.tcs.practices;
import java.util.*;
public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int  i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        boolean found = false;
        for(int  i = 0; i < n; i++){
            int complement = target - arr[i];
            if(set.contains(complement)){
                found = true;
                break;
            }
            set.add(arr[i]);
        }
        System.out.println(found);
    }
}
