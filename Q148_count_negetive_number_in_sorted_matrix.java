/*
 !Name: Aritra Ghorai
 !Date:08/09/2021
 ?Program Details:1351. Count Negative Numbers in a Sorted Matrix
*https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
   */
public class Q148_count_negetive_number_in_sorted_matrix {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int colm = 0; colm < grid[0].length; colm++) {
                if (grid[row][colm] < 0) {
                    count += grid[0].length - colm;
                    break;
                }

            }
        }
        return count;
    }
}
