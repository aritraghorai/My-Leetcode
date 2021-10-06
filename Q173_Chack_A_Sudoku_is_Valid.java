import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:06/10/2021
 ?Program Details:36. Valid Sudoku
 *https://leetcode.com/problems/valid-sudoku/
   */
public class Q173_Chack_A_Sudoku_is_Valid {
    public boolean isValidSudoku(char[][] board) {
        var set = new HashSet<String>();
        for (int row = 0; row < 9; row++) {
            for (int colm = 0; colm < 9; colm++) {
                if (board[row][colm] == '.')
                    continue;
                int boxNo = (row / 3) * 3 + (colm / 3);
                String rowS = "Row" + row + board[row][colm];
                String colmS = "Colm" + colm + board[row][colm];
                String boxS = "Box" + boxNo + board[row][colm];
                if (set.contains(rowS) || set.contains(colmS) || set.contains(boxS)) {
                    return false;
                } else {
                    set.add(rowS);
                    set.add(colmS);
                    set.add(boxS);
                }
            }
        }
        return true;
    }
}
