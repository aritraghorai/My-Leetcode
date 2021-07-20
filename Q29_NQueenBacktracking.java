import java.util.ArrayList;
import java.util.List;

/*
 !Name: Aritra Ghorai
 !Date:20/07/2021
 ?Program Details:51. N-Queens
 *https://leetcode.com/problems/n-queens/
   */
public class Q29_NQueenBacktracking {
    public static void main(String[] args) {
        System.out.println(solveNQueens(6));
    }

    static List<List<String>> Result = new ArrayList<>();

    public static List<List<String>> solveNQueens(int n) {
        nQueen(new boolean[n][n], 0, new ArrayList<>());
        return Result;
    }

    public static void nQueen(boolean[][] arr, int row, List<String> result) {
        if (row == arr.length) {
            Result.add(new ArrayList<String>(result));
            return;
        }
        for (int i = 0; i < arr[row].length; i++) {
            if (isOk(arr, row, i)) {
                arr[row][i] = true;
                String s = generAte(i, arr[row].length);
                result.add(s);
                nQueen(arr, row + 1, result);
                result.remove(result.size() - 1);
                arr[row][i] = false;

            }
        }
    }

    private static String generAte(int k, int n) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i == k)
                s.append("Q");
            else
                s.append(".");
        }

        return s.toString();
    }

    private static boolean isOk(boolean[][] board, int row, int colm) {
        for (int i = row; i >= 0; i--) {
            if (board[i][colm] == true) {
                return false;
            }
        }
        for (int i = row, j = colm; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == true)
                return false;
        }
        for (int i = row, j = colm; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == true)
                return false;
        }
        return true;
    }
}
