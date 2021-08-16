import java.util.Arrays;

/*
 !Name: Aritra Ghorai
 !Date:13/08/2021
 ?Program Details: 213. House Robber II
 *https://leetcode.com/problems/house-robber-ii/
   */
public class Q94_House_Robber2 {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] storage = new int[3];
        for (int i = nums.length - 1; i > 0; i--) {
            storage[0] = Math.max(storage[1], storage[2] + nums[i]);
            storage[2] = storage[1];
            storage[1] = storage[0];
        }
        int max = storage[0];
        Arrays.fill(storage, 0);
        for (int i = nums.length - 2; i >= 0; i--) {
            storage[0] = Math.max(storage[1], storage[2] + nums[i]);
            storage[2] = storage[1];
            storage[1] = storage[0];
        }
        return Math.max(max, storage[0]);
    }

}
