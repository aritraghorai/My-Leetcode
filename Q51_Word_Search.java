
/*
 !Name: Aritra Ghorai
 !Date:28/07/2021
 ?Program Details: 79. Word Search
 *https://leetcode.com/problems/word-search/
   */
public class Q51_Word_Search {
    public static boolean exist(char[][] board, String word) {
        boolean bool = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                bool = exist(board, "", word, i, j, new boolean[board.length][board[0].length], 0);
                if (bool == true) {
                    return true;
                }
            }
        }
        return bool;
    }

    public static boolean exist(char[][] board, String recS, String word, int row, int colm, boolean[][] chack,
            int count) {
        if (recS.equals(word)) {
            return true;
        }
        if (row == -1 || colm == -1 || row == board.length || colm == board[0].length || chack[row][colm] == true
                || word.charAt(count) != board[row][colm]) {
            return false;
        }

        chack[row][colm] = true;
        // *Top Call
        boolean top = exist(board, recS + board[row][colm], word, row - 1, colm, chack, count + 1);
        // *Buttom call
        boolean buttom = exist(board, recS + board[row][colm], word, row + 1, colm, chack, count + 1);
        // *Left call
        boolean left = exist(board, recS + board[row][colm], word, row, colm + 1, chack, count + 1);
        // *Right call
        boolean right = exist(board, recS + board[row][colm], word, row, colm - 1, chack, count + 1);
        chack[row][colm] = false;

        return top || buttom || left || right;

    }
}
