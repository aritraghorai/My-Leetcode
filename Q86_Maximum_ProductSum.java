import java.util.Arrays;

/*
 !Name: Aritra Ghorai
 !Date:10/08/2021
 ?Program Details: 628. Maximum Product of Three Numbers
*https://leetcode.com/problems/maximum-product-of-three-numbers/
   */
public class Q86_Maximum_ProductSum {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int frsitMax = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int lastMax = nums[0] * nums[1] * nums[n - 1];
        return Math.max(frsitMax, lastMax);
    }

}
