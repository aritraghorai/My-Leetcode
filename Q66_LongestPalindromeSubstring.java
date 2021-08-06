import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:05/08/2021
 ?Program Details: 5.Longest Palindromic Substring
 *https://leetcode.com/problems/longest-palindromic-substring/
   */
public class Q66_LongestPalindromeSubstring {
  public static String longestPalindrome(String s) {
    return longestPalindrome(s, new StringBuilder(s).reverse().toString(), 0, 0);
  }

  public static String longestPalindrome(String s, String revS, int index1, int index2) {
    if (index1 == s.length() || index2 == s.length()) {
      return "";
    }
    String result = "";
    if (s.charAt(index1) == revS.charAt(index2)) {
      result += s.charAt(index1) + longestPalindrome(s, revS, index1 + 1, index2 + 1);
    } else {
      String fI = longestPalindrome(s, revS, index1, index2 + 1);
      String lI = longestPalindrome(s, revS, index1 + 1, index2);
      result = fI.length() > lI.length() ? fI : lI;
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();
    System.out.println(longestPalindrome(s));
  }
}
