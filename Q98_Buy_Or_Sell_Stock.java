import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:17/08/2021
 ?Program Details:309. Best Time to Buy and Sell Stock with Cooldown
 *https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/ 
   */
public class Q98_Buy_Or_Sell_Stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices) {
        return maxProfit(prices, 1, 0, new Integer[2][prices.length]);

    }

    public static int maxProfit(int[] prices, int buy, int index) {
        if (index >= prices.length)
            return 0;
        int result = 0;
        if (buy == 1) {
            int BuyStock = maxProfit(prices, 0, index + 1) - prices[index];
            int NoBuyStock = maxProfit(prices, 1, index + 1);
            result = Math.max(BuyStock, NoBuyStock);
        } else {
            int SellStock = maxProfit(prices, 1, index + 2) + prices[index];
            int NoSellStock = maxProfit(prices, 0, index + 1);
            result = Math.max(SellStock, NoSellStock);
        }
        return result;
    }

    public static int maxProfit(int[] prices, int buy, int index, Integer[][] storage) {
        if (index >= prices.length)
            return 0;
        int result = 0;
        if (storage[buy][index] != null)
            return storage[buy][index];
        if (buy == 1) {
            int BuyStock = maxProfit(prices, 0, index + 1, storage) - prices[index];
            int NoBuyStock = maxProfit(prices, 1, index + 1, storage);
            result = Math.max(BuyStock, NoBuyStock);
        } else {
            int SellStock = maxProfit(prices, 1, index + 2, storage) + prices[index];
            int NoSellStock = maxProfit(prices, 0, index + 1, storage);
            result = Math.max(SellStock, NoSellStock);
        }
        storage[buy][index] = result;
        return result;
    }
}
