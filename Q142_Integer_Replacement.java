import java.util.HashMap;

/*
 !Name: Aritra Ghorai
 !Date:07/09/2021
 ?Program Details: 397. Integer Replacement
 *https://leetcode.com/problems/integer-replacement/
   */
public class Q142_Integer_Replacement {
    public int integerReplacement(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if (n == Integer.MAX_VALUE) {
            return 32;
        }
        map.put(1, 0);
        return dp(n, map);
    }

    public int dp(int n, HashMap<Integer, Integer> map) {
        if (n <= 1) {
            return 0;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int res = 0;
        if ((n & 1) == 0) {
            res = 1 + dp(n /= 2, map);
        } else {
            res = Math.min(dp((n - 1) / 2, map), dp((n + 1) / 2, map)) + 2;
        }
        map.put(n, res);
        return res;
    }

}
