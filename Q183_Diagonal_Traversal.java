/*
 !Name: Aritra Ghorai
 !Date:19/10/2021
 ?Program Details:498. Diagonal Traverse
 *https://leetcode.com/problems/diagonal-traverse/
   */
public class Q183_Diagonal_Traversal {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = mat.length;
        int colm = mat[0].length;
        int r = 0, c = 0;
        int[] res = new int[row * colm];
        int dir = 1;
        for (int i = 0; i < res.length; i++) {
            res[i] = mat[r][c];
            if (dir == 1) {
                if (c == colm - 1) {
                    r++;
                    dir = 1;
                } else if (row == 0) {
                    c++;
                    dir = -1;
                } else {
                    r--;
                    c++;
                }
            } else {
                if (r == row - 1) {
                    c++;
                    dir = 1;
                } else if (c == 0) {
                    r++;
                    dir = 1;
                } else {
                    r++;
                    c--;
                }
            }
        }
        return res;
    }
}
