import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:30/08/2021
 ?Program Details:494. Target Sum
 *https://leetcode.com/problems/target-sum/ 
   */
public class Q130_targetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int diff = sc.nextInt();
        sc.close();
        System.out.println(findTargetSumWays(nums, diff));
    }

    public static int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        for (int a : nums)
            totalSum += a;
        if (totalSum < target || (totalSum - target) % 2 == 1) {
            return 0;
        }
        int different = (totalSum - target) / 2;
        int[][] dp = new int[nums.length + 1][different + 1];
        dp[nums.length][0] = 1;
        for (int row = nums.length - 1; row >= 0; row--) {
            for (int colm = 0; colm <= different; colm++) {
                if (colm >= nums[row]) {
                    dp[row][colm] = dp[row + 1][colm] + dp[row + 1][colm - nums[row]];
                } else {
                    dp[row][colm] = dp[row + 1][colm];
                }
            }
        }
        return dp[0][different];
    }

}
