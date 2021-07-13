import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:11/07/2021
 ?Program Details: 122. Best Time to Buy and Sell Stock II
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
   */
public class Q13BuyAndSellStock {
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

    public static int maxProfit(int[] prices) {
        int totalproft = 0;
        for (int i = 1; i < prices.length; i++) {
            if ((prices[i] - prices[i - 1]) > 0) {
                totalproft += (prices[i] - prices[i - 1]);
            }
        }
        return totalproft;
    }

}
