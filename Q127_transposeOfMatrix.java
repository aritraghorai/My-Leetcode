/*
 !Name: Aritra Ghorai
 !Date:28/08/2021
 ?Program Details: 867. Transpose Matrix
*https://leetcode.com/problems/transpose-matrix/
   */
public class Q127_transposeOfMatrix {
    public int[][] transpose(int[][] matrix) {
        int[][] transposeMatrix = new int[matrix[0].length][matrix.length];
        for (int colm = 0; colm < matrix[0].length; colm++) {
            for (int row = 0; row < matrix.length; row++) {
                transposeMatrix[colm][row] = matrix[row][colm];
            }
        }
        return transposeMatrix;
    }
}
