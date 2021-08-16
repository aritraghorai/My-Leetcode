import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:13/08/2021
 ?Program Details: 152. Maximum Product Subarray
 *https://leetcode.com/problems/maximum-product-subarray/
   */
public class Q95MaximumProductSum {
    public static int maxProduct(int[] nums) {

        int maxVal = nums[0];
        int minVal = nums[0];

        int maxProduct = nums[0];
        for (int i = 1; i < nums.length; ++i) {

            if (nums[i] < 0)
                maxVal = maxVal ^ minVal ^ (minVal = maxVal);

            maxVal = Math.max(nums[i], nums[i] * maxVal);
            minVal = Math.min(nums[i], nums[i] * minVal);

            maxProduct = Math.max(maxProduct, maxVal);
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(maxProduct(nums));
    }

}
