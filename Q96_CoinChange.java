import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:13/08/2021
 ?Program Details:322. Coin Change
 https://leetcode.com/problems/coin-change/ 
   */
public class Q96_CoinChange {

    public static int coinChange(int[] coins, int amount) {

        int result = coinChange(coins, amount, coins.length - 1, new Integer[coins.length + 1][amount + 1]);
        if (result >= 1001) {
            return -1;
        } else {
            return result;
        }
        // int n = coins.length;
        // int[][] dp = new int[n + 1][amount + 1];
        // for (int row = n; row >= 0; row++) {
        // for (int colm = 0; colm <= amount; colm++) {
        // if (row == n || colm == 0) {
        // if (colm == 0) {
        // dp[row][colm] = 0;
        // } else {
        // dp[row][colm] = 1001;
        // }
        // } else {
        // if (coins[row] <= colm) {
        // dp[row][colm] = Math.min(1 + dp[row][colm - coins[row]], dp[row + 1][colm]);
        // } else {
        // dp[row][colm] = dp[row + 1][colm];
        // }
        // }
        // }
        // }
        // if (dp[0][0] >= 1001) {
        // return -1;
        // } else {
        // return dp[n - 1][amount];
        // }
    }

    public static int coinChange(int[] coins, int amount, int n, Integer[][] storage) {
        if (amount == 0 || n == -1) {
            if (amount == 0) {
                return 0;
            } else {
                return 1001;
            }
        }
        if (storage[n][amount] != null) {
            return storage[n][amount];
        }
        // *Include Coin
        if (coins[n] <= amount)
            storage[n][amount] = Math.min(1 + coinChange(coins, amount - coins[n], n, storage),
                    coinChange(coins, amount, n - 1, storage));
        else
            return coinChange(coins, amount, n - 1, storage);
        return storage[n][amount];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        int amount = sc.nextInt();
        sc.close();
        System.out.println(coinChange(coins, amount));
    }
}
