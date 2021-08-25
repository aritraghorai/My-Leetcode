import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:25/08/2021
 ?Program Details: 1004. Max Consecutive Ones III
 *https://leetcode.com/problems/max-consecutive-ones-iii/
   */
public class Q119_Max_ConsicutiveOneIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();
        System.out.println(longestOnes(nums, k));
    }

    public static int longestOnes(int[] nums, int k) {
        int i = 0, j = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while (i < nums.length && j < nums.length) {
            if ((j - i + 1) <= sum + k) {
                sum += nums[j];
                max = Math.max(max, (j - i + 1));
                j++;
            } else {
                if (nums[j] == 1) {
                    sum += nums[j];
                    max = Math.max(max, (j - i + 1));
                    j++;
                } else {
                    sum -= nums[i];
                    i++;
                }

            }
        }
        return max;
    }
}
