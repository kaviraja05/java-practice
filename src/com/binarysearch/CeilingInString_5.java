package com.binarysearch;
//find the smallest letter greater than the target
//note: letters are wrap around

public class CeilingInString_5 {
    public static void main(String[] args) {
        char[] arr = {'c', 'd', 'f', 'j'};
        char target = 'd';
        char ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static char binarySearch(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = (start + end)/2;

            if(target < letters[mid]) end = mid - 1;
            else start = mid + 1;
        }
        //return letters[start];
        return letters[start % letters.length];
    }

}
