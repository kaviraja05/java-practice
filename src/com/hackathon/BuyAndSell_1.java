package com.hackathon;

//2. Best Time to Buy and Sell Stock
//Problem: Maximize profit from one buy and one sell.
//Idea:
//Track the minimum price so far.
//At each day, calculate profit if sold today → update max profit.
//     Real-world analogy:
//Track lowest gold price day (buy day). Each day you check: “If I bought at the cheapest price so far, and sold today, how much profit?”
public class BuyAndSell_1 {
    public static void main(String[] args) {
        BuyAndSell_1 sb = new BuyAndSell_1();
        int[] arr = {7,1,5,3,6,4};
        System.out.println(sb.maxCalculation(arr));

    }
    public int maxCalculation(int[] nums){
        int minValue = nums[0];
        int maxProfit = 0;

        for(int price : nums){
            if(price < minValue) minValue = price;

            int profit = price - minValue;
            if(profit > maxProfit) maxProfit = profit;
        }
        return maxProfit;
    }
}
