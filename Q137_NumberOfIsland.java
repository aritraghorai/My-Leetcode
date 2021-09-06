import java.util.ArrayDeque;

/*
 !Name: Aritra Ghorai
 !Date:05/09/2021
 ?Program Details: 200. Number of Islands
 *https://leetcode.com/problems/number-of-islands/
   */
public class Q137_NumberOfIsland {
    private static class pair {
        int row;
        int colm;

        pair(int row, int colm) {
            this.row = row;
            this.colm = colm;
        }

    }

    public static int numIslands(char[][] grid) {
        var queue = new ArrayDeque<pair>();
        boolean[][] chack = new boolean[grid.length][grid[0].length];
        int numberOfIsland = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && chack[i][j] == false) {
                    queue.offer(new pair(i, j));
                    while (!queue.isEmpty()) {
                        var rp = queue.poll();
                        chack[rp.row][rp.colm] = true;
                        if (isValid(grid, chack, rp.row + 1, rp.colm)) {
                            queue.offer(new pair(rp.row + 1, rp.colm));
                        }
                        if (isValid(grid, chack, rp.row - 1, rp.colm)) {
                            queue.offer(new pair(rp.row - 1, rp.colm));
                        }
                        if (isValid(grid, chack, rp.row, rp.colm + 1)) {
                            queue.offer(new pair(rp.row, rp.colm + 1));
                        }
                        if (isValid(grid, chack, rp.row, rp.colm - 1)) {
                            queue.offer(new pair(rp.row, rp.colm - 1));
                        }

                    }
                    // dfs(grid, chack, i, j);
                    // numberOfIsland++;
                }
            }
        }
        return numberOfIsland;
    }

    private static boolean isValid(char[][] chack, boolean[][] chack2, int row, int colm) {
        if (row == -1 || colm == -1 || row == chack.length || colm == chack[0].length || chack[row][colm] == '0'
                || chack2[row][colm] == true) {
            return false;
        }
        return true;
    }

    // *This is DFS Solution
    static void dfs(char[][] grid, boolean[][] chack, int row, int colm) {
        if (row == -1 || colm == -1 || row == grid.length || colm == grid[0].length || grid[row][colm] == '0'
                || chack[row][colm] == true) {
            return;
        }
        chack[row][colm] = true;
        dfs(grid, chack, row + 1, colm);
        dfs(grid, chack, row, colm + 1);
        dfs(grid, chack, row - 1, colm);
        dfs(grid, chack, row, colm - 1);
    }
}
