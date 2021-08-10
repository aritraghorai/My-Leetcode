/*
 !Name: Aritra Ghorai
 !Date:09/08/2021
 ?Program Details: 977. Squares of a Sorted Array
 *https://leetcode.com/problems/squares-of-a-sorted-array/
   */
public class Q83_SquareOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int k = nums.length - 1;
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            if (Math.abs(nums[i]) >= Math.abs(nums[j])) {
                result[k] = nums[i] * nums[i];
                i++;
                k--;
            } else {
                result[k] = nums[j] * nums[j];
                j--;
                k--;
            }

        }
        return result;
    }
}
