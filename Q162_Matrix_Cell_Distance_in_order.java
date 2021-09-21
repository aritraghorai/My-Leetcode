import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:21/09/2021
 ?Program Details:1030. Matrix Cells in Distance Order
 *https://leetcode.com/problems/matrix-cells-in-distance-order/
   */
public class Q162_Matrix_Cell_Distance_in_order {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        var ans = new int[rows * cols][2];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int bno = i * cols + j;
                ans[bno][0] = i;
                ans[bno][1] = j;
            }
        }
        Arrays.sort(ans, (a, b) -> {
            int dis1 = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int dis2 = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return dis1 - dis2;
        });
        return ans;
    }
}
