/*
 !Name: Aritra Ghorai
 !Date:04/11/2021
 ?Program Details:413. Arithmetic Slics
 *https://leetcode.com/problems/arithmetic-slices/
   */
public class Q190_Longest_Arithmetic_Slice {
    public int numberOfArithmeticSlices(int[] nums) {
        int[] dp = new int[nums.length];
        int ans = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] * nums[i - 2] == 2 * nums[i - 1]) {
                dp[i] = dp[i - 1] + 1;
                ans += dp[i];
            }
        }
        return ans;
    }
}
