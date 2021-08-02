/*
 !Name: Aritra Ghorai
 !Date:01/08/2021
 ?Program Details: 63. Unique Paths II
 *https://leetcode.com/problems/unique-paths-ii/
   */
public class Q59_UniquePath2 {

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // return uniquePath2(obstacleGrid, 0, 0, new int[obstacleGrid.length +
        // 1][obstacleGrid[0].length + 1]);
        int[][] storage = new int[obstacleGrid.length + 1][obstacleGrid[0].length + 1];
        for (int row = obstacleGrid.length - 1; row >= 0; row--) {
            for (int colm = obstacleGrid[0].length - 1; colm >= 0; colm--) {
                if (obstacleGrid[row][colm] == 1) {
                    continue;
                } else if (row == obstacleGrid.length - 1 && colm == obstacleGrid[0].length - 1) {
                    storage[row][colm] = 1;
                } else {
                    storage[row][colm] = storage[row + 1][colm] + storage[row][colm + 1];
                }
            }
        }
        return storage[0][0];
    }

    public static int uniquePath2(int[][] obstacleGrid, int row, int colm, int[][] storage) {
        if (row == obstacleGrid.length - 1 && colm == obstacleGrid[0].length) {
            return 1;
        }
        if (obstacleGrid[row][colm] == 1 || row == obstacleGrid.length || colm == obstacleGrid[0].length) {
            return 0;
        }
        if (storage[row][colm] != 0) {
            return storage[row][colm];
        }
        // *Down And right call
        int result = uniquePath2(obstacleGrid, row + 1, colm, storage)
                + uniquePath2(obstacleGrid, row, colm + 1, storage);
        storage[row][colm] = result;
        return result;
    }
}
