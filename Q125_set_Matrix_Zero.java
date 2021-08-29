import java.util.Arrays;
import java.util.HashSet;

/*
 !Name: Aritra Ghorai
 !Date:27/08/2021
 ?Program Details:73. Set Matrix Zeroes
 *https://leetcode.com/problems/lucky-numbers-in-a-matrix/
   */
public class Q125_set_Matrix_Zero {

    public void setZeroes(int[][] matrix) {
        var setRow = new HashSet<Integer>();
        var coloumSet = new HashSet<Integer>();
        for (int row = 0; row < matrix.length; row++) {
            for (int colm = 0; colm < matrix[0].length; colm++) {

                if (matrix[row][colm] == 0) {

                    setRow.add(row);

                    coloumSet.add(colm);

                }

            }
        }
        for (int a : setRow) {
            rowZerofill(matrix, a);
        }
        for (int a : coloumSet) {
            colmZeroFill(matrix, a);
        }
    }

    private void rowZerofill(int[][] matrix, int row) {
        Arrays.fill(matrix[row], 0);
    }

    private void colmZeroFill(int[][] matrix, int colm) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][colm] = 0;
        }
    }
}
