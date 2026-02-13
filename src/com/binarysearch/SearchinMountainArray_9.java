package com.binarysearch;

public class SearchinMountainArray_9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,2,1};
        int target = 2;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target){
        int peak = mountainArray(arr);
        int firstTry = orderAgnosticSearch(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticSearch(arr, target, peak+1, arr.length - 1);
    }
    static int mountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return arr[start];// or return arr[end] as both are equal.
    }
    static int orderAgnosticSearch(int[] arr, int target, int start, int end){
        boolean isAsc;
        if(arr[start] < arr[end]) {
            isAsc = true;
        }else isAsc = false;


        while(start <= end){
            int mid = (start + end)/2;
            if(target == arr[mid]) return mid;

            if(isAsc){
                if(target < arr[mid]) end = mid - 1;
                else start = mid + 1;
            }
            else{
                if(target < arr[mid]) start = mid + 1;
                else end = mid - 1;
            }

        }
        return -1;
    }
}
