package com.binarysearch;
//find the peak index in a mountain array or bitonic array.
public class MountainArray_8 {
    public static void main(String[] args) {
        int[] arr = {11,12,13,14,15,16,17,16,15,14,13,12,11};
        System.out.println(mountainArray(arr));
    }
    static int mountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //you are in decending part of the array.
                //this may be the ans, but look at left
                //that is why end != mid - 1
                end = mid;
            }
          //  else if(arr[mid] < arr[mid + 1])
            else{
                //you are in the ascending paet of the array.
                start = mid + 1;//bcoz, we know that mid + 1 element > mid element
            }
        }
        //in the end, start==end and pointing to the largest number because of the 2 checks above
        //start and end are always trying to find the max element in the above 2 checks
        //hence, when they are pointing to 1 element, that is the max one bcoz that is what the check says
        //more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying only one item is remaining, hence bcoz of above line, that is the best possible answer
        return arr[start];// or return arr[end] as both are equal.
    }
}
