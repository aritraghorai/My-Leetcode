import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:23/08/2021
 ?Program Details:10. Regular Expression Matching 
 *https://leetcode.com/problems/regular-expression-matching/
   */
public class Q111_Regular_Expression_Matching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        sc.close();
        System.out.println(isMatch(s, p));
    }

    public static boolean isMatch(String s, String p) {
        // return isMatch(s, p, 0, 0, new Boolean[s.length() + 1][p.length() + 1]);
        boolean[][] storage = new boolean[s.length() + 1][p.length() + 1];
        int sl = s.length();
        int pl = p.length();
        for (int row = sl; row >= 0; row--) {
            for (int colm = pl; colm >= 0; colm--) {
                if (row == sl && colm == pl) {
                    storage[row][colm] = true;
                } else if (row == sl && colm != pl) {
                    if (colm != pl - 1 && p.charAt(colm + 1) == '*') {
                        storage[row][colm] = storage[row][colm + 2];
                    } else {
                        storage[row][colm] = false;
                    }
                } else if (sl != row && pl == colm) {
                    storage[row][colm] = false;
                } else {
                    boolean result = false;
                    if (colm != pl - 1 && p.charAt(colm + 1) == '*') {
                        result = result || storage[row][colm + 2];
                        if (s.charAt(row) == p.charAt(colm) || p.charAt(colm) == '.') {
                            result = result || storage[row + 1][colm];
                        }
                    } else {
                        if (s.charAt(row) == p.charAt(colm) || p.charAt(colm) == '.') {
                            result = result || storage[row + 1][colm + 1];
                        }
                    }
                    storage[row][colm] = result;
                }
            }
        }
        return storage[0][0];
    }

    public static boolean isMatch(String s, String p, int index1, int index2) {
        if (s.length() <= index1 && p.length() <= index2)
            return true;
        if (s.length() != index1 && p.length() <= index2) {
            return false;
        }
        if (s.length() <= index1 && p.length() != index2) {
            if (index2 != p.length() - 1 && p.charAt(index2 + 1) == '*') {
                return isMatch(s, p, index1, index2 + 2);
            }
            return false;
        }
        boolean result = false;
        if (index2 != p.length() - 1 && p.charAt(index2 + 1) == '*') {
            result = result || isMatch(s, p, index1, index2 + 2);
            if (s.charAt(index1) == p.charAt(index2) || p.charAt(index2) == '.') {
                result = result || isMatch(s, p, index1 + 1, index2);
            }
        } else {
            if (s.charAt(index1) == p.charAt(index2) || p.charAt(index2) == '.') {
                result = result || isMatch(s, p, index1 + 1, index2 + 1);
            }
        }
        return result;
    }

    public static boolean isMatch(String s, String p, int index1, int index2, Boolean[][] storage) {
        if (s.length() <= index1 && p.length() <= index2)
            return true;
        if (s.length() != index1 && p.length() <= index2) {
            return false;
        }
        if (s.length() <= index1 && p.length() != index2) {
            if (index2 != p.length() - 1 && p.charAt(index2 + 1) == '*') {
                return isMatch(s, p, index1, index2 + 2, storage);
            }
            return false;
        }
        if (storage[index1][index2] != null)
            return storage[index1][index2];
        boolean result = false;
        if (index2 != p.length() - 1 && p.charAt(index2 + 1) == '*') {
            result = result || isMatch(s, p, index1, index2 + 2, storage);
            if (s.charAt(index1) == p.charAt(index2) || p.charAt(index2) == '.') {
                result = result || isMatch(s, p, index1 + 1, index2, storage);
            }
        } else {
            if (s.charAt(index1) == p.charAt(index2) || p.charAt(index2) == '.') {
                result = result || isMatch(s, p, index1 + 1, index2 + 1, storage);
            }
        }
        storage[index1][index2] = result;
        return result;
    }
}
