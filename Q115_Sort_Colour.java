/*
 !Name: Aritra Ghorai
 !Date:24/08/2021
 ?Program Details: 75. Sort Colors
 *https://leetcode.com/problems/sort-colors/
   */
public class Q115_Sort_Colour {
    public static void sortColors(int[] nums) {
        int i = 0, j = 0, k = nums.length - 1;
        while (j <= k) {
            if (nums[j] == 0) {
                swap(nums, i, j);
                i++;
                j++;
            } else if (nums[j] == 1) {
                j++;
            } else {
                swap(nums, i, k);
                k--;
            }
        }
    }

    public static void swap(int[] nums, int a, int b) {
        if (a == b)
            return;
        nums[a] = nums[a] ^ nums[b];
        nums[b] = nums[a] ^ nums[b];
        nums[a] = nums[a] ^ nums[b];
    }
}
