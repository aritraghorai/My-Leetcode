import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:17/08/2021
 ?Program Details:377. Combination Sum IV
 *https://leetcode.com/problems/combination-sum-iv/ 
   */
public class Q99_Combination_Sum4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();
        System.out.println(combinationSum4(nums, target));
    }

    public static int combinationSum4(int[] nums, int target) {
        // return combinationSum4(nums, target, new Integer[target + 1]);
        int[] storage = new int[target + 1];
        storage[0] = 1;
        for (int i = 1; i <= target; i++) {
            int result = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i >= nums[j])
                    result += storage[i - nums[j]];
            }
            storage[i] = result;
        }
        return storage[target];
    }

    public static int combinationSum4(int[] nums, int target, Integer[] storage) {
        if (target == 0)
            return 1;
        if (storage[target] != null)
            return storage[target];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target >= nums[i])
                result += combinationSum4(nums, target - nums[i], storage);
        }
        storage[target] = result;
        return result;
    }
}
