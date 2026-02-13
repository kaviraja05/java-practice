package com.practice;

import java.util.Arrays;
import java.util.Scanner;

//find the second largest element in an array
public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-2]);
    }


//    import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//    public class SecondLargestUsingSort {
//
//        // Function to find second largest
//        static int findSecondLargest(Integer[] arr) {
//
//            // Convert array to list
//            List<Integer> list = Arrays.asList(arr);
//
//            // Sort the list
//            Collections.sort(list);
//
//            // Reverse the list
//            Collections.reverse(list);
//
//            // Return second element
//            return list.get(1);
//        }
//
//        public static void main(String[] args) {
//            Integer[] arr = {10, 5, 20, 8, 15};
//
//            int result = findSecondLargest(arr);
//            System.out.println("Second Largest element: " + result);
//        }
//    }

}
