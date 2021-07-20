import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:20/07/2021
 ?Program Details:28. Implement strStr()
 *https://leetcode.com/problems/implement-strstr/
   */
public class Q30_StrStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String sub = sc.next();
        System.out.println(strStr(s, sub));
        sc.close();
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.length() == 0 && needle.length() == 0) {
            return 0;
        }
        if (haystack.length() == 0 && needle.length() != 0) {
            return -1;
        }

        int length = needle.length();
        StringBuilder s = new StringBuilder(haystack);
        for (int i = 0; i < haystack.length(); i++) {
            if (i + length > haystack.length())
                break;
            if (s.substring(i, i + length).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
