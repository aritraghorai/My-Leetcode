/*
 !Name: Aritra Ghorai
 !Date:10/09/2021
 ?Program Details:279. Perfect Squares
 *https://leetcode.com/problems/perfect-squares/ 
   */
public class Q154_Perfect_Squares {
    public static void main(String[] args) {
        System.out.println(numSquares(16));
    }

    public static int numSquares(int n) {
        // return numSquaresRec(n, new Integer[n + 1]);
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i <= 3) {
                dp[i] = i;
            } else {
                int ans = 1000;
                for (int j = 1; j <= i; j++) {
                    if ((i - j * j) >= 0) {
                        ans = Math.min(ans, dp[i - j * j] + 1);
                    } else {
                        break;
                    }
                }
                dp[i] = ans;
            }
        }
        return dp[n];
    }

    public static int numSquaresRec(int n, Integer[] storage) {
        if (n < 0) {
            return 1000;
        }
        if (n <= 3) {
            return n;
        }
        if (storage[n] != null) {
            return storage[n];
        }
        int ans = 1000;
        for (int i = 1; i < n; i++) {
            ans = Math.min(ans, numSquaresRec(n - i * i, storage) + 1);
        }
        storage[n] = ans;
        return ans;
    }
}
