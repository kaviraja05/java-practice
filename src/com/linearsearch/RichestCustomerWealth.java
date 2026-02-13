package com.linearsearch;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {{111, 2, 3}, {4, 5, 6}};
        int ans = maxWealth(arr);
        System.out.println(ans);
    }
    static int maxWealth(int[][] num){
        //person = row and account = col
        int max = Integer.MIN_VALUE;
        for (int person = 0; person < num.length; person++) {
            //when you start a new col, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < num[person].length; account++) {
                 sum += num[person][account];
            }
            //now, we have a sum of accounts of a person, check with overall max value
            if(sum > max) {
                max = sum;

            }
        }
        return max;
    }
}
