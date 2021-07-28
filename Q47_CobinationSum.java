import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:27/07/2021
 ?Program Details: 39. Combination Sum
 *https://leetcode.com/problems/combination-sum/
   */
public class Q47_CobinationSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        combinationSum(nums, 7);
        System.out.println(result);
        sc.close();
    }

    static List<List<Integer>> result = new ArrayList<>();

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        combinationSum(candidates, 0, 0, target, new ArrayList<>());
        return result;
    }

    public static void combinationSum(int[] candidates, int sum, int start, int target, ArrayList<Integer> cal) {
        if (sum == target) {
            result.add(new ArrayList<>(cal));
            return;
        }
        if (sum > target) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            cal.add(candidates[i]);
            combinationSum(candidates, sum + candidates[i], i, target, cal);
            cal.remove(cal.size() - 1);
        }
    }
}
