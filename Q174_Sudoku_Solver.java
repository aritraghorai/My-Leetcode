import java.util.Arrays;

/*
 !Name: Aritra Ghorai
 !Date:06/10/2021
 ?Program Details:37. Sudoku Solver
 *https://leetcode.com/problems/sudoku-solver/
   */
public class Q174_Sudoku_Solver {
    public static void main(String[] args) {
        char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
        solveSudoku(board);
        for (char[] a : board)
            System.out.println(Arrays.toString(a));

    }

    public static void solveSudoku(char[][] board) {
        healper(board, 0, 0);
    }

    public static boolean healper(char[][] board, int row, int colm) {
        if (row == 9)
            return true;
        if (colm == 9)
            return healper(board, row + 1, 0);
        if (board[row][colm] == '.') {
            for (int i = 1; i <= 9; i++) {
                if (CanPlace(board, row, colm, i)) {
                    board[row][colm] = (char) (i + '0');
                    if (healper(board, row, colm + 1))
                        return true;
                    board[row][colm] = '.';
                }
            }
            return false;
        } else {
            return healper(board, row, colm + 1);
        }
    }

    public static boolean CanPlace(char[][] board, int row, int colm, int value) {

        for (int i = 0; i < 9; i++) {
            if (board[row][i] == (char) (value + '0')) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (board[i][colm] == (char) (value + '0')) {
                return false;
            }
        }
        int sr = (row / 3) * 3;
        int sc = (colm / 3) * 3;
        for (int i = sr; i < (sr + 3); i++) {
            for (int j = sc; j < (sc + 3); j++) {
                if (board[i][j] == (char) (value + '0'))
                    return false;
            }
        }
        return true;
    }

}
