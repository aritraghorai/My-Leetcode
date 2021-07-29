import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:29/07/2021
 ?Program Details: 77. Combinations
 *https://leetcode.com/problems/combinations/
   */
public class Q53Combinations {
    static List<List<Integer>> result = new ArrayList<>();

    public static List<List<Integer>> combine(int n, int k) {
        combine(n, k, 1, new ArrayList<>());
        return result;
    }

    public static void combine(int n, int k, int start, List<Integer> rec) {
        if (k == 0) {
            result.add(new ArrayList<>(rec));
        }
        for (int i = start; i <= n; i++) {
            rec.add(i);
            combine(n, k - 1, i + 1, rec);
            rec.remove(rec.size() - 1);
        }
    }

}
