/*
 !Name: Aritra Ghorai
 !Date:11/08/2021
 ?Program Details:238. Product of Array Except Self
 *https://leetcode.com/problems/product-of-array-except-self/ 
   */
public class Q90_ProductSum_EspectOwn {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixPro = new int[n];
        prefixPro[0] = nums[0];
        for (int i = 1; i < n - 1; i++) {
            prefixPro[i] = prefixPro[i - 1] * nums[i];
        }
        int sudffix = 1;
        for (int i = n - 1; i > 0; i--) {
            prefixPro[i] = prefixPro[i - 1] * sudffix;
            sudffix *= nums[i];
        }
        prefixPro[0] = sudffix;
        return prefixPro;

    }
}
