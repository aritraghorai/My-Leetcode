import java.util.ArrayList;
import java.util.List;

/*
 !Name: Aritra Ghorai
 !Date:27/08/2021
 ?Program Details: 1380. Lucky Numbers in a Matrix
 *https://leetcode.com/problems/lucky-numbers-in-a-matrix/
   */
public class Q124_LuckyNumber {
    public static void main(String[] args) {

        // int[][] arr = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };
        int[][] arr = { { 1, 10, 4, 2 }, { 9, 3, 8, 7 }, { 15, 16, 17, 12 } };
        System.out.println(luckyNumbers(arr));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        var result = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            int m = Integer.MAX_VALUE, colmIndex = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (m > matrix[i][j]) {
                    m = matrix[i][j];
                    colmIndex = j;
                }
            }
            int ok = 0;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][colmIndex] > matrix[i][colmIndex]) {
                    ok = 1;
                    break;
                }
            }
            if (ok == 0) {
                result.add(matrix[i][colmIndex]);
            }
        }
        return result;
    }
}
