import java.util.Arrays;

/*
 !Name: Aritra Ghorai
 !Date:01/08/2021
 ?Program Details:62. Unique Paths
 *https://leetcode.com/problems/unique-paths/
   */
public class Q58_uniquePathas {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }

    public static int uniquePaths(int m, int n) {
        // return uniquePathsTopDown(0, 0, m - 1, n - 1, new int[m][n]);
        int[] memory = new int[n];
        Arrays.fill(memory, 1);
        for (int change = 1; change < m; change++) {
            for (int colm = n - 1; colm >= 0; colm--) {
                if (colm == n - 1) {
                    memory[colm] = 1;
                } else
                    memory[colm] = memory[colm] + memory[colm + 1];
            }
        }
        return memory[0];
    }

    public static int uniquePathsTopDown(int cr, int cc, int m, int n, int[][] arr) {
        if (cr == m && cc == n) {
            return 1;
        }
        if (cr > m || cc > n) {
            return 0;
        }
        if (arr[cr][cc] != 0) {
            return arr[cr][cc];
        }
        // *Down call and right call
        int res = uniquePathsTopDown(cr + 1, cc, m, n, arr) + uniquePathsTopDown(cr, cc + 1, m, n, arr);
        arr[cr][cc] = res;
        return res;
    }
}
