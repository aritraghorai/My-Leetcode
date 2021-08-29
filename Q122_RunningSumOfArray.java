
/*
 !Name: Aritra Ghorai
 !Date:27/08/2021
 ?Program Details: 1480. Running Sum of 1d Array
 *https://leetcode.com/problems/running-sum-of-1d-array/s
   */
public class Q122_RunningSumOfArray {
    public int[] runningSum(int[] nums) {
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = nums[i] + prefixSum[i - 1];
        }
        return prefixSum;
    }
}
