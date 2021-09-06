/*
 !Name: Aritra Ghorai
 !Date:05/09/2021
 ?Program Details:130. Surrounded Regions
 *https://leetcode.com/problems/surrounded-regions/
   */
public class Q139_surrounded_resign {
    public void solve(char[][] board) {
        // *for all the edge row
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 'O')
                helper(board, i, 0);
            if (board[i][board[0].length - 1] == 'O')
                helper(board, i, board[0].length - 1);
        }
        // *for edge colm
        for (int i = 0; i < board[0].length; i++) {
            if (board[0][i] == 'O') {
                helper(board, 0, i);
            }
            if (board[board.length - 1][i] == 'O') {
                helper(board, board.length - 1, i);
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '*') {
                    board[i][j] = 'O';
                } else {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public static void helper(char[][] board, int row, int colm) {
        if (row == -1 || colm == -1 || row == board.length || colm == board[0].length || board[row][colm] != 'O') {
            return;
        }
        board[row][colm] = '*';
        helper(board, row + 1, colm);
        helper(board, row - 1, colm);
        helper(board, row, colm + 1);
        helper(board, row, colm - 1);

    }
}
