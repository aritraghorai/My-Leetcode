import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:04/10/2021
 ?Program Details:918. Maximum Sum Circular Subarray 
 *https://leetcode.com/problems/maximum-sum-circular-subarray/
   */
public class Q170_Maximum_Sum_In_Circular_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        sc.close();
        System.out.println(maxSubarraySumCircular(nums));
    }

    public static int maxSubarraySumCircular(int[] nums) {
        if (nums.length == 0)
            return 0;
        int fristMax = kardane(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] *= -1;
        }

        int z = kardane(nums);
        if (sum + z == 0)
            return fristMax;
        return Math.max(fristMax, sum + z);
    }

    public static int kardane(int[] nums) {
        int CurSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {

            CurSum += nums[i];
            maxSum = Math.max(maxSum, CurSum);
            if (CurSum < 0)
                CurSum = 0;
        }
        return maxSum;
    }
}
