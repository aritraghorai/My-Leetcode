import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:07/08/2021
 ?Program Details: Min Cost Climbing Stairs
 *https://leetcode.com/problems/min-cost-climbing-stairs/
   */
public class Q77_MinCostToCLimb {
    public static int minCostClimbingStairs(int[] cost) {
        // return Math.min(minCostClimbingStairs(cost, 0), minCostClimbingStairs(cost,
        // 1));
        int min1 = 0, min2 = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            int current = cost[i] + Math.min(min1, min2);
            min1 = min2;
            min2 = current;
        }
        return Math.min(min1, min2);
    }

    public static int minCostClimbingStairs(int[] cost, int index) {
        if (cost.length <= index) {
            return 0;
        }
        int step1 = minCostClimbingStairs(cost, index + 1);
        int step2 = minCostClimbingStairs(cost, index + 2);
        return Math.min(step1, step2) + cost[index];

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(minCostClimbingStairs(nums));
    }
}
