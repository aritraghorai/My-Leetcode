
/*
 !Name: Aritra Ghorai
 !Date:29/08/2021
 ?Program Details:416. Partition Equal Subset Sum 
 *https://leetcode.com/problems/partition-equal-subset-sum/
   */
public class Q129_partionEqualSubset {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int a : nums)
            sum += a;
        if (sum % 2 != 0) {
            return false;
        }
        sum = sum / 2;
        return tagetSumEfficient(nums, sum);

    }

    public static boolean tagetSumEfficient(int[] nums, int target) {
        boolean[][] storage = new boolean[nums.length + 1][target + 1];
        for (int row = nums.length; row >= 0; row--) {
            for (int colm = 0; colm <= target; colm++) {
                if (colm == 0) {
                    storage[row][colm] = true;
                } else if (row == nums.length) {
                    storage[row][colm] = false;
                } else {
                    if (colm >= nums[row]) {
                        storage[row][colm] = storage[row + 1][colm - nums[row]];
                    } else {
                        storage[row][colm] = storage[row + 1][colm];
                    }
                }
            }
        }
        return storage[0][target];
    }
}
