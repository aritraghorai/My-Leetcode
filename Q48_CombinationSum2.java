import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:27/07/2021
 ?Program Details:40. Combination Sum II
*https://leetcode.com/problems/combination-sum-ii/
   */
public class Q48_CombinationSum2 {
    static List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        combinationSum2(candidates, 0, target, new ArrayList<>());
        return result;
    }

    public static void combinationSum2(int[] candidates, int start, int target, ArrayList<Integer> cal) {
        if (target == 0) {
            result.add(new ArrayList<>(cal));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i != start && candidates[i] == candidates[i - 1])
                continue;
            cal.add(candidates[i]);
            combinationSum2(candidates, i + 1, target - candidates[i], cal);
            cal.remove(cal.size() - 1);
        }
    }
}
