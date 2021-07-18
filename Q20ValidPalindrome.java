
import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:15/07/2021
 ?Program Details:125. Valid Palindrome
 *https://leetcode.com/problems/valid-palindrome/
   */
public class Q20ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
        sc.close();
    }

    public static boolean isPalindrome(String s) {
        // s = s.replaceAll(" ", "").replaceAll(",", "").replaceAll(":",
        // "").toLowerCase();
        s = s.replaceAll("[^a-zA-Z\\d]", "").toLowerCase();

        System.out.println(s);
        // StringBuilder reverse = new StringBuilder();
        // for (int i = s.length() - 1; i >= 0; i--) {
        // reverse.append(s.charAt(i));
        // }
        int i = 0, j = s.length() - 1;
        while (j >= i) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        // System.out.println(reverse.toString());
        return true;
    }
}
