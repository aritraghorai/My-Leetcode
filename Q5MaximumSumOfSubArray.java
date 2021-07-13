import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:09/07/2021
 ?Program Details:Maximum Subarray problem using kadane algorithm
   */
public class Q5MaximumSumOfSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(maxSubArray(nums));
        sc.close();
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
