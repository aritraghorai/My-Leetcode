/*
 !Name: Aritra Ghorai
 !Date:17/10/2021
 ?Program Details:5. Longest Palindromic Substring
 *https://leetcode.com/problems/longest-palindromic-substring/
   */
public class Q179_Longest_palindrome_Substring {
    public static void main(String[] args) {
        String s = "bb";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        boolean[][] storage = new boolean[s.length()][s.length()];
        var sArray = s.toCharArray();
        int si = 0, ei = 0;
        for (int gap = 0; gap < s.length(); gap++) {
            for (int i = 0; i < s.length() - gap; i++) {
                int j = i + gap;
                if (gap == 0) {
                    storage[i][j] = true;
                    si = i;
                    ei = j;
                } else if (gap == 1) {
                    if (sArray[i] == sArray[j]) {
                        storage[i][j] = true;
                        si = i;
                        ei = j;
                    }
                } else {
                    if (sArray[i] == sArray[j]) {
                        if (storage[i + 1][j - 1]) {
                            storage[i][j] = true;
                            si = i;
                            ei = j;
                        }
                    }
                }
            }
        }
        var sb = new StringBuilder();
        for (int i = si; i <= ei; i++) {
            sb.append(sArray[i]);
        }
        return sb.toString();
    }
}
