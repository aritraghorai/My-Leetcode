import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:06/09/2021
 ?Program Details:915. Partition Array into Disjoint Intervals
 *https://leetcode.com/problems/partition-array-into-disjoint-intervals/
   */
public class Q140_Partition_Array_Disjoin_Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(partitionDisjoint(nums));
    }

    public static int partitionDisjoint(int[] nums) {
        int partI = 0;
        int sideMax = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (sideMax >= nums[i]) {
                partI = i + 1;
                sideMax = max;
                if (sideMax != max) {
                    max = sideMax;
                }
            } else {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
        }
        return partI;
    }
}
