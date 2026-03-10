//input: No of integers: 7
//-7,1,5,2,-4,3,0
//output : 3
//hint: leftsum arr = [0,-7,-6,-1,1,-3,0]
//rightsum arr = [0,0,3,-1,1,6,7]
//index 3 has same element

package com.tcs.practices;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int[] leftarr = new int[n];
        for(int j = 1; j < n; j++){
            leftarr[j] = leftarr[j-1] + arr[j-1];
        }
        int[] rightarr = new int[n];
        for(int k = n-2; k >= 0; k--){
            rightarr[k] = rightarr[k+1] + arr[k+1];
        }
        for(int h = 0; h < n; h++){
            if(leftarr[h] == rightarr[h]){
                System.out.println(h);
                break;
            }
        }
    }
}
