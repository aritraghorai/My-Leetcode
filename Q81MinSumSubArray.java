/*
 !Name: Aritra Ghorai
 !Date:08/08/2021
 ?Program Details: 209. Minimum Size Subarray Sum
 *https://leetcode.com/problems/minimum-size-subarray-sum/
   */
public class Q81MinSumSubArray {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                result = Math.min(i - left + 1, result);
                sum -= nums[left];
                left++;
            }

        }
        return (result != Integer.MAX_VALUE) ? result : 0;
    }
}
