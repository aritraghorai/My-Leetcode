
/*
 !Name: Aritra Ghorai
 !Date:25/11/2021
 ?Program Details:415. Add Strings
 *https://leetcode.com/problems/add-strings/
   */
public class Q191_Add_String {
    public static void main(String[] args) {
        String s1 = "11";
        String s2 = "123";
        System.out.println(addStrings(s1, s2));

    }

    public static String addStrings(String num1, String num2) {
        if (num2.length() > num1.length())
            return addStrings(num2, num1);
        StringBuilder res = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1;
        boolean get1 = false;
        while (i >= 0 && j >= 0) {
            int sum = 0;
            if (get1) {
                sum = num1.charAt(i) - '0' + num2.charAt(j) - '0' + 1;
                get1 = false;
            } else
                sum = num1.charAt(i) - '0' + num2.charAt(j) - '0';
            if (sum > 9) {
                get1 = true;
                res.append(sum % 10);
            } else {
                res.append(sum);
            }
            i--;
            j--;
        }
        while (i >= 0) {
            int sum = 0;
            if (get1) {
                sum = num1.charAt(i) - '0' + 1;
                get1 = false;
            } else
                sum = num1.charAt(i) - '0';
            if (sum > 9) {
                get1 = true;
                res.append(sum % 10);
            } else {
                res.append(sum);
            }
            i--;
        }
        if (get1)
            res.append(1);

        return res.reverse().toString();
    }
}
