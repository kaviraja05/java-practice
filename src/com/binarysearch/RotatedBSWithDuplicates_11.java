package com.binarysearch;

public class RotatedBSWithDuplicates_11 {
    public static void main(String[] args) {
        int[] arr = {3,9,2,1,1};
        int target = 1;
        System.out.println(search(arr, target));
    }
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            // 4 cases
            if(end > mid && arr[mid] > arr[mid+1]) return mid;
            if(start < mid && arr[mid] < arr[mid-1]) return mid-1;
            // if elements at mid, start, end are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicates
                //NOTE: what if these elements at start and end were the pivot?
                //check if start is pivot
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                // check whether end is pivot
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            //left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    static int search(int[] arr, int target){
        int pivot = pivot(arr);
        //If you didnot find a pivot, it means the array is not rotated
        if(pivot == -1) return binarySearch(arr, target, 0, arr.length-1);

        //3 cases
        //If pivot is found, you have 2 asc sorted array
        if (arr[pivot] == target) return pivot;
        if (target >= arr[0]) return binarySearch(arr, target, 0, pivot - 1);
        return binarySearch(arr, target, pivot+1, arr.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = (start + end)/2;
            if(target < arr[mid]) end = mid - 1;
            else if(target > arr[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    }
}
