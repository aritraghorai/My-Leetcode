import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:16/09/2021
 ?Program Details:724. Find Pivot Index
 *https://leetcode.com/problems/find-pivot-index/ 
   */
public class Q160_find_pivot_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int[] pre = new int[nums.length];
        // pre[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pre[i] = pre[i - 1] + nums[i - 1];
        }
        int suffix = 0;
        int index = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (suffix == pre[i]) {
                index = i;
            }
            suffix += nums[i];
        }
        return index;
    }
}
