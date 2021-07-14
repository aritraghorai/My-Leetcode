import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:13/07/2021
 ?Program Details:14. Longest Common Prefix 
 *https://leetcode.com/problems/longest-common-prefix/
   */
public class Q16_LowestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }
        sc.close();
        System.out.println(longestCommonPrefix(s));
    }

    public static String longestCommonPrefix(String[] strs) {
        String s = "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            int j = 1;
            for (j = 1; j < strs.length; j++) {
                if (strs[j].length() > i) {
                    if (strs[j].charAt(i) != c) {
                        break;
                    }
                } else {
                    break;
                }
            }
            if (j == strs.length)
                s += c;
            else
                break;
        }
        return s;

    }
}
