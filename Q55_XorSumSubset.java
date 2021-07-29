/*
 !Name: Aritra Ghorai
 !Date:30/07/2021
 ?Program Details:1863. Sum of All Subset XOR Totals
 *https://leetcode.com/problems/sum-of-all-subset-xor-totals/
   */
public class Q55_XorSumSubset {
    public static void main(String[] args) {

    }

    public static int subsetXORSum(int[] nums) {
        return subsetXORSum(nums, 0, 0);
    }

    public static int subsetXORSum(int[] nums, int index, int xors) {
        if (index == nums.length) {
            return xors;
        }
        int num = nums[index];
        return subsetXORSum(nums, index + 1, xors ^ num) + subsetXORSum(nums, index + 1, xors);
    }
}
