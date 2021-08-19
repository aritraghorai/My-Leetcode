import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:19/08/2021
 ?Program Details:16. 3Sum Closest
 *https://leetcode.com/problems/3sum-closest/
   */
public class Q104_3SumClosest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();
        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int different = Integer.MAX_VALUE;
        int sum = 0;
        int cloestSum = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            sum = nums[i];
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int Presum = sum + nums[j] + nums[k];
                if (Presum == target) {
                    return Presum;
                }
                if (Math.abs(Presum - target) < different) {
                    cloestSum = Presum;
                    different = Math.abs(Presum - target);
                }
                if (Presum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return cloestSum;
    }
}
