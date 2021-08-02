import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:01/08/2021
 ?Program Details: 64. Minimum Path Sum
 *https://leetcode.com/problems/minimum-path-sum/
   */
public class Q60_MinimumPathSum {
    public static void main(String[] args) {
        // int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
        int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {
        // return minPathSum(grid, 0, 0, new int[grid.length][grid[0].length]);
        int[][] storage = new int[grid.length + 1][grid[0].length + 1];
        for (int[] a : storage) {
            Arrays.fill(a, Integer.MAX_VALUE);
        }
        for (int row = grid.length - 1; row >= 0; row--) {
            for (int colm = grid[0].length - 1; colm >= 0; colm--) {
                if (row == grid.length - 1 && colm == grid[0].length - 1) {
                    storage[row][colm] = grid[row][colm];
                } else {
                    storage[row][colm] = Math.min(storage[row + 1][colm], storage[row][colm + 1]) + grid[row][colm];
                }
            }
        }
        return storage[0][0];
    }

    public static int minPathSum(int[][] grid, int row, int colm, int[][] storage) {
        if (row == grid.length - 1 && colm == grid[0].length - 1) {
            return grid[row][colm];
        }
        if (row == grid.length || colm == grid[0].length) {
            return Integer.MAX_VALUE;
        }
        if (storage[row][colm] != 0) {
            return storage[row][colm];
        }
        int downR = minPathSum(grid, row + 1, colm, storage);
        int rightR = minPathSum(grid, row, colm + 1, storage);
        int ans = Math.min(downR, rightR) + grid[row][colm];
        storage[row][colm] = ans;
        return ans;
    }
}
