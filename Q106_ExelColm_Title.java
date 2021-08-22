
/*
 !Name: Aritra Ghorai
 !Date:21/08/2021
 ?Program Details: 168. Excel Sheet Column Title
 *https://leetcode.com/problems/excel-sheet-column-title/
   */
public class Q106_ExelColm_Title {
    public static String convertToTitle(int columnNumber) {
        StringBuilder s = new StringBuilder("");
        int n = columnNumber;
        while (n > 0) {
            n--;
            int temp = n % 26;
            n /= 26;

            s.insert(0, (char) ('A' + temp));
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(26));
    }
}
