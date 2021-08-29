/*
 !Name: Aritra Ghorai
 !Date:27/08/2021
 ?Program Details: 1672. Richest Customer Wealth
 *https://leetcode.com/problems/richest-customer-wealth/
   */
public class Q123_richest_customer_wealth {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int[] a : accounts) {
            for (int b : a) {
                sum += b;
            }
            if (sum > max)
                max = sum;
            sum = 0;
        }
        return max;
    }

}
