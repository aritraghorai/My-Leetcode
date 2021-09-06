import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:05/09/2021
 ?Program Details: 827. Making A Large Island
 *https://leetcode.com/problems/making-a-large-island/
   */
public class Q138_Making_A_Large_Island {
    public static void main(String[] args) {
        // int[][] grid = { { 1, 1, 1, 0 }, { 0, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 1
        // } };

        int[][] grid = { { 1, 0, 0, 1, 1 }, { 1, 0, 0, 1, 0 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1 },
                { 0, 0, 0, 1, 0 } };
        System.out.println(largestIsland(grid));
        for (int[] a : grid) {
            System.out.println(Arrays.toString(a));
        }
    }

    public static int largestIsland(int[][] grid) {
        // *To Mark islands
        // *Id Vs Area
        var map = new HashMap<Integer, Integer>();
        map.put(0, 0);
        int id = 2;
        for (int row = 0; row < grid.length; row++) {
            for (int colm = 0; colm < grid[0].length; colm++) {
                if (grid[row][colm] == 1) {
                    int area = dfs(grid, row, colm, id);
                    map.put(id, area);
                    id++;
                }
            }
        }
        int maxArea = map.getOrDefault(2, 0);
        for (int row = 0; row < grid.length; row++) {
            for (int colm = 0; colm < grid[0].length; colm++) {
                if (grid[row][colm] == 0) {
                    var set = new HashSet<Integer>();
                    if (row != 0) {
                        set.add(grid[row - 1][colm]);
                    }
                    if (colm != 0) {
                        set.add(grid[row][colm - 1]);
                    }
                    if (row != grid.length - 1) {
                        set.add(grid[row + 1][colm]);
                    }
                    if (colm != grid[0].length - 1) {
                        set.add(grid[row][colm + 1]);
                    }
                    int area = 1;
                    for (int a : set) {
                        area += map.get(a);
                    }
                    maxArea = Math.max(area, maxArea);

                }
            }
        }
        return maxArea;

    }

    private static int dfs(int[][] grid, int row, int colm, int id) {
        if (row == grid.length || row == -1 || colm == -1 || colm == grid[0].length || grid[row][colm] != 1)
            return 0;
        grid[row][colm] = id;
        return 1 + dfs(grid, row + 1, colm, id) + dfs(grid, row - 1, colm, id) + dfs(grid, row, colm + 1, id)
                + dfs(grid, row, colm - 1, id);
    }
}
