import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:08/08/2021
 ?Program Details:97. Interleaving String
*https://leetcode.com/problems/interleaving-string/ 
   */
public class Q80_Inter_Leaving {
    public static boolean isInterleave(String s1, String s2, String s3) {
        if ((s1.length() + s2.length()) != s3.length()) {
            return false;
        }
        // return isInterleave(s1, s2, s3, 0, 0, new Boolean[s1.length() +
        // 1][s2.length() + 1]);
        Boolean[][] storage = new Boolean[s1.length() + 1][s2.length() + 1];
        for (int row = s1.length(); row >= 0; row--) {
            for (int colm = s2.length(); colm >= 0; colm--) {
                if (row == s1.length() && colm == s2.length()) {
                    storage[row][colm] = true;
                } else {
                    boolean result = false;
                    if (row != s1.length() && s1.charAt(row) == s3.charAt(row + colm)) {
                        result = result || storage[row + 1][colm];
                    }
                    if (colm != s2.length() && s2.charAt(colm) == s3.charAt(row + colm)) {
                        result = result || storage[row][colm + 1];
                    }
                    storage[row][colm] = result;
                }
            }
        }
        return storage[0][0];
    }

    public static boolean isInterleave(String s1, String s2, String s3, int i, int j, Boolean[][] storage) {
        if (s1.length() == i && s2.length() == j) {
            return true;
        }
        if (storage[i][j] != null) {
            return true;
        }
        boolean result = false;
        if (i != s1.length() && s1.charAt(i) == s3.charAt(i + j)) {
            result = result || isInterleave(s1, s2, s3, i + 1, j, storage);
        }
        if (j != s2.length() && s2.charAt(j) == s3.charAt(i + j)) {
            result = result || isInterleave(s1, s2, s3, i, j + 1, storage);
        }
        storage[i][j] = result;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        System.out.println(isInterleave(s1, s2, s3));
        sc.close();
    }
}
