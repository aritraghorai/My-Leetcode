package Array;

import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:11/07/2021
 ?Program Details:  121. Best Time to Buy and Sell Stock
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
   */
public class Q12BuyAndSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(maxProfit(nums));
        sc.close();
    }

    // *Complexity O(n2)
    public static int maxProfitMY(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        if (maxProfit < 0) {
            return 0;
        }
        return maxProfit;
    }

    public static int maxProfit(int[] prices) {
        int miniMumPriceTillDate = Integer.MAX_VALUE;
        int todayProfit = 0;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < miniMumPriceTillDate) {
                miniMumPriceTillDate = prices[i];
            }
            todayProfit = prices[i] - miniMumPriceTillDate;
            if (todayProfit > maxprofit) {
                maxprofit = todayProfit;
            }
        }
        return maxprofit;
    }
}
