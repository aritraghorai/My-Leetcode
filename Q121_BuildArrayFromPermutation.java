/*
 !Name: Aritra Ghorai
 !Date:27/08/2021
 ?Program Details: 1920. Build Array from Permutation
 *https://leetcode.com/problems/build-array-from-permutation/
   */
public class Q121_BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
