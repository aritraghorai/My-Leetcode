/*
 !Name: Aritra Ghorai
 !Date:27/08/2021
 ?Program Details: 680. Valid Palindrome II
 *https://leetcode.com/problems/valid-palindrome-ii/
   */
public class Q120_ValidPalindrome2 {
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {
        return validPalindrome(s, 0, s.length() - 1, 0);
    }

    public static boolean validPalindrome(String s, int si, int ei, int k) {
        if (k > 1) {
            return false;
        }

        while (si <= ei) {
            if (s.charAt(si) == s.charAt(ei)) {
                si++;
                ei--;
            } else {
                break;
            }
        }
        if (si >= ei) {
            return true;
        } else
            return validPalindrome(s, si + 1, ei, k + 1) || validPalindrome(s, si, ei - 1, k + 1);

    }
}
