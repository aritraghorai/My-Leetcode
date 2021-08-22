import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:13/08/2021
 ?Program Details: 152. Maximum Product Subarray
 *https://leetcode.com/problems/maximum-product-subarray/
   */
public class Q95MaximumProductSum {
    public static int maxProduct(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int product = 1;
        int maxProduct = Integer.MIN_VALUE;
        for (int a : nums) {
            if (a != 0) {
                product *= a;
                if (product > maxProduct) {
                    maxProduct = product;
                }
            } else {
                product = 1;
            }
        }
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                product *= nums[i];
                if (product > maxProduct) {
                    maxProduct = product;
                }
            } else {
                product = 1;
            }

        }
        return Math.max(maxProduct, 0);
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
