import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:16/08/2021
 ?Program Details:54. Spiral Matrix
 *https://leetcode.com/problems/spiral-matrix/ 
   */
public class Q97_SpritualMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int ro = 1;
        int fr = 0, lr = matrix.length - 1;
        int fc = 0, lc = matrix[0].length - 1;
        int element = matrix.length * matrix[0].length;
        while (element != 0) {
            if (ro == 1) {
                for (int i = fc; i <= lc; i++) {
                    result.add(matrix[fr][i]);
                    element--;
                }
                fr++;
                ro = 2;

            } else if (ro == 2) {
                for (int i = fr; i <= lr; i++) {
                    result.add(matrix[i][lc]);
                    element--;
                }
                lc--;
                ro = 3;
            } else if (ro == 3) {
                for (int i = lc; i >= fc; i--) {
                    result.add(matrix[lr][i]);
                    element--;
                }
                lr--;
                ro = 4;

            } else if (ro == 4) {
                for (int i = lr; i >= fr; i--) {
                    result.add(matrix[i][fc]);
                    element--;
                }
                fc++;
                ro = 1;
            }
        }
        return result;
    }
}
