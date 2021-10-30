/*
 !Name: Aritra Ghorai
 !Date:20/10/2021
 ?Program Details:151. Reverse Words in a String
 *https://leetcode.com/problems/reverse-words-in-a-string/ 
   */
public class Q184_Reverse_Of_A_String {
    public static void main(String[] args) {
        System.out.println(reverseWords("good"));
    }

    public static String reverseWords(String s) {
        int i = s.length() - 1;
        int j = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        StringBuilder res = new StringBuilder();
        while (i >= 0 && j >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            j = i + 1;
            while (i > 0 && s.charAt(i) != ' ')
                i--;
            if (sb.charAt(i) == ' ') {
                if (res.length() == 0) {
                    res.append(s.substring(i + 1, j));
                } else {
                    res.append(" " + s.substring(i + 1, j));
                }
            } else {
                if (res.length() == 0) {
                    res.append(s.substring(i, j));
                } else {
                    res.append(" " + s.substring(i, j));
                }
            }
            if (i == 0)
                break;
        }
        return res.toString();
    }
}
