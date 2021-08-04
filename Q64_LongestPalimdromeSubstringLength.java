import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:04/08/2021
 ?Program Details:5.516. Longest Palindromic Subsequence
 *https://leetcode.com/problems/longest-palindromic-subsequence/
   */
public class Q64_LongestPalimdromeSubstringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {
        int[][] storage = new int[s.length() + 1][s.length() + 1];
        StringBuilder rev = new StringBuilder(s).reverse();
        for (int row = s.length() - 1; row >= 0; row--) {
            for (int colm = s.length() - 1; colm >= 0; colm--) {

                if (s.charAt(row) == rev.charAt(colm)) {
                    storage[row][colm] = storage[row + 1][colm + 1] + 1;
                } else {
                    storage[row][colm] = Math.max(storage[row + 1][colm], storage[row][colm + 1]);
                }

            }

        }
        return storage[0][0];

    }

}
