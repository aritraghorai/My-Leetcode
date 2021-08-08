import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:08/08/2021
 ?Program Details: 120. Triangle
 *https://leetcode.com/problems/triangle/
   */
public class Q79_Triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        // return minimumTotal(triangle, 0, 0, new
        // int[triangle.size()][triangle.size()]);
        int n = triangle.size();
        int[][] storage = new int[n + 1][n + 1];
        for (int row = n; row >= 0; row--) {
            for (int colm = row; colm >= 0; colm--) {
                if (row == n) {
                    storage[row][colm] = 0;
                } else {
                    storage[row][colm] = Math.min(storage[row + 1][colm], storage[row + 1][colm + 1])
                            + triangle.get(row).get(colm);
                }
            }
        }
        return storage[0][0];

    }

    public static int minimumTotal(List<List<Integer>> triangle, int row, int colm, int[][] storage) {
        if (row == triangle.size()) {
            return 0;
        }
        if (storage[row][colm] != 0) {
            return storage[row][colm];
        }
        int result = 0;
        int left = minimumTotal(triangle, row + 1, colm, storage);
        int right = minimumTotal(triangle, row + 1, colm + 1, storage);
        result = Math.min(left, right) + triangle.get(row).get(colm);
        storage[row][colm] = result;
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(2));
        triangle.add(List.of(3, 4));
        triangle.add(List.of(6, 5, 7));
        triangle.add(List.of(4, 1, 8, 3));
        System.out.println(minimumTotal(triangle));
    }

}
