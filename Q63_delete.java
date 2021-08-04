import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:04/08/2021
 ?Program Details: 583. Delete Operation for Two Strings
 *https://leetcode.com/problems/delete-operation-for-two-strings/
   */
public class Q63_delete {
    public static int minDistance(String word1, String word2) {
        // int[][] storage = new int[word1.length()][word2.length()];
        // for (int[] a : storage) {
        // Arrays.fill(a, -1);
        // }
        // return minDistance(word1, word2, 0, 0, storage);
        int[][] storage = new int[word1.length() + 1][word2.length() + 1];
        for (int row = word1.length(); row >= 0; row--) {
            for (int colm = word2.length(); colm >= 0; colm--) {
                if (row == word1.length()) {
                    storage[row][colm] = word2.length() - colm;
                } else if (colm == word2.length()) {
                    storage[row][colm] = word1.length() - row;
                } else {
                    if (word1.charAt(row) == word2.charAt(colm)) {
                        storage[row][colm] = storage[row + 1][colm + 1];
                    } else {
                        storage[row][colm] = Math.min(storage[row + 1][colm], storage[row][colm + 1]) + 1;
                    }
                }
            }
        }
        return storage[0][0];

    }

    public static int minDistance(String word1, String word2, int index1, int index2, int[][] storage) {
        if (word1.length() == index1 || word2.length() == index2) {
            return Math.max(word1.length() - index1, word2.length() - index2);
        }
        if (storage[index1][index2] != -1) {
            return storage[index1][index2];
        }
        int result = 0;
        if (word1.charAt(index1) == word2.charAt(index2)) {
            result = minDistance(word1, word2, index1 + 1, index2 + 1, storage);
        } else {
            int delete1 = minDistance(word1, word2, index1 + 1, index2, storage);
            int delete2 = minDistance(word1, word2, index1, index2 + 1, storage);
            result = Math.min(delete1, delete2) + 1;

        }
        storage[index1][index2] = result;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        sc.close();
        System.out.println(minDistance(word1, word2));

    }
}
