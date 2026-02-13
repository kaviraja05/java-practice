package com.binarysearch;

public class SearchInRSA_10 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int target = 2;
        System.out.println(search(arr, target));
    }
    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // 4 cases
            if (end > mid && arr[mid] > arr[mid + 1]) return mid;
            if (start < mid && arr[mid] < arr[mid - 1]) return mid - 1;
            if (arr[mid] <= arr[start]) end = mid - 1;
            else start = mid + 1;
        }
            return -1;
        }

        static int search ( int[] arr, int target){
            int pivot = pivot(arr);
            //If you didnot find a pivot, it means the array is not rotated
            if (pivot == -1) return binarySearch(arr, target, 0, arr.length - 1);

            //3 cases
            //If pivot is found, you have 2 asc sorted array
            if (arr[pivot] == target) return pivot;
            if (target >= arr[0]) return binarySearch(arr, target, 0, pivot - 1);
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }

        static int binarySearch ( int[] arr, int target, int start, int end){
            while (start <= end) {
                int mid = (start + end) / 2;
                if (target < arr[mid]) end = mid - 1;
                else if (target > arr[mid]) start = mid + 1;
                else return mid;
            }
            return -1;
        }
    }
