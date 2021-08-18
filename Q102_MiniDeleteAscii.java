import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:18/08/2021
 ?Program Details:712. Minimum ASCII Delete Sum for Two Strings 
 *https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/
   */
public class Q102_MiniDeleteAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();
        System.out.println(minimumDeleteSum(s1, s2));
    }

    public static int minimumDeleteSum(String s1, String s2) {
        // return minimumDeleteSum(s1, s2, 0, 0, new Integer[s1.length() +
        // 1][s2.length() + 1]);
        int[][] storage = new int[s1.length() + 1][s2.length() + 1];
        for (int row = s1.length(); row >= 0; row--) {
            for (int colm = s2.length(); colm >= 0; colm--) {
                if (row == s1.length() && colm == s2.length()) {
                    storage[row][colm] = 0;
                } else if (row == s1.length() && colm != s2.length()) {
                    storage[row][colm] = ((int) s2.charAt(colm)) + storage[row][colm + 1];
                } else if (row != s1.length() && colm == s2.length()) {
                    storage[row][colm] = ((int) s1.charAt(row)) + storage[row + 1][colm];
                } else {
                    if (s1.charAt(row) == s2.charAt(colm)) {
                        storage[row][colm] = storage[row + 1][colm + 1];
                    } else {
                        int option1 = ((int) s1.charAt(row)) + storage[row + 1][colm];
                        int option2 = ((int) s2.charAt(colm)) + storage[row][colm + 1];
                        storage[row][colm] = Math.min(option1, option2);
                    }

                }
            }
        }
        return storage[0][0];
    }

    public static int minimumDeleteSum(String s1, String s2, int indx1, int indx2, Integer[][] storage) {
        if (s1.length() == indx1 && s2.length() == indx2)
            return 0;
        if (s1.length() == indx1 && s2.length() != indx2) {
            int res = 0;
            for (int i = indx2; i < s2.length(); i++) {
                res += ((int) (s2.charAt(i)));
            }
            return res;
        }
        if (s1.length() != indx1 && s2.length() == indx2) {
            int res = 0;
            for (int i = indx1; i < s1.length(); i++) {
                res += ((int) (s1.charAt(i)));
            }
            return res;
        }
        if (storage[indx1][indx2] != null) {
            return storage[indx1][indx2];
        }
        int result = 0;
        if (s1.charAt(indx1) == s2.charAt(indx2)) {
            result = minimumDeleteSum(s1, s2, indx1 + 1, indx2 + 1, storage);
        } else {
            int option1 = minimumDeleteSum(s1, s2, indx1 + 1, indx2, storage) + ((int) s1.charAt(indx1));
            int option2 = minimumDeleteSum(s1, s2, indx1, indx2 + 1, storage) + ((int) s2.charAt(indx2));
            result = Math.min(option1, option2);
        }
        storage[indx1][indx2] = result;
        return result;
    }
}
