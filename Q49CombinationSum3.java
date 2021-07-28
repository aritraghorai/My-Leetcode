import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:27/07/2021
 ?Program Details:216.Combination Sum III
 *https://leetcode.com/problems/combination-sum-iii/
   */
public class Q49CombinationSum3 {
    public static void main(String[] args) {
        combinationSum3(3, 9);
        System.out.println(result);
    }

    static List<List<Integer>> result = new ArrayList<>();

    public static List<List<Integer>> combinationSum3(int k, int n) {
        combinationSum3(k, n, new ArrayList<>(), 1);
        return result;
    }

    public static void combinationSum3(int k, int n, List<Integer> rec, int start) {
        if (n == 0 && k == 0) {
            result.add(new ArrayList<>(rec));
            return;
        }
        if (k == 0 || n < 0) {
            return;
        }
        for (int i = start; i <= 9; i++) {
            rec.add(i);
            combinationSum3(k - 1, n - i, rec, i + 1);
            rec.remove(rec.size() - 1);
        }
    }
}
