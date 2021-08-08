import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:07/08/2021
 ?Program Details: 392. Is Subsequence
 *https://leetcode.com/problems/is-subsequence/
   */
public class Q76_isSequence {
    public static boolean isSubsequence(String s, String t) {
        // return isSubsequence(s, t, 0, 0);
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i != s.length() && j == t.length()) {
            return false;
        }
        return true;

    }

    // *s = "abc", t = "ahbgdc"
    public static boolean isSubsequence(String s, String t, int index1, int index2) {
        if (s.length() == index1 || t.length() == index2) {
            if (s.length() != index1 && t.length() == index2) {
                return false;
            }
            return true;
        }
        boolean isOk = false;
        if (s.charAt(index1) == t.charAt(index2)) {
            isOk = isOk || isSubsequence(s, t, index1 + 1, index2 + 1);
        } else {
            isOk = isOk || isSubsequence(s, t, index1, index2 + 1);
        }
        return isOk;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(isSubsequence(s1, s2));
        sc.close();
    }
}
