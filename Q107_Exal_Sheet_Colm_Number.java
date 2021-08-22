/*
 !Name: Aritra Ghorai
 !Date:21/08/2021
 ?Program Details: 171. Excel Sheet Column Number
 *https://leetcode.com/problems/excel-sheet-column-number/
   */
public class Q107_Exal_Sheet_Colm_Number {
    public static int titleToNumber(String columnTitle) {
        int length = columnTitle.length();
        int result = 0;
        for (char a : columnTitle.toCharArray()) {
            int temp = (int) (a) - 64;
            result += Math.pow(26, length - 1) * temp;
            length--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("ZY"));
    }
}
