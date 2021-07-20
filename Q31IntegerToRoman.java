import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:20/07/2021
 ?Program Details:12. Integer to Roman
 *https://leetcode.com/problems/integer-to-roman/
   */
public class Q31IntegerToRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println(intToRoman(a));
    }

    public static String intToRoman(int num) {

        StringBuilder s = new StringBuilder();
        while (true) {
            if (num == 0) {
                break;
            }

            if (num >= 1000) {
                s.append("M");
                num -= 1000;
            } else if (num >= 900) {
                s.append("CM");
                num -= 900;
            } else if (num >= 500) {
                s.append("D");
                num -= 500;
            } else if (num >= 400) {
                s.append("CD");
                num -= 400;
            } else if (num >= 100) {
                s.append("C");
                num -= 100;
            } else if (num >= 90) {
                num -= 90;
                s.append("XC");
            } else if (num >= 50) {
                num -= 50;
                s.append("L");
            } else if (num >= 40) {
                num -= 40;
                s.append("XL");
            } else if (num >= 10) {
                num -= 10;
                s.append("X");
            } else if (num >= 9) {
                num -= 9;
                s.append("IX");
            } else if (num >= 5) {
                num -= 5;
                s.append("V");
            } else if (num >= 4) {
                num -= 4;
                s.append("IV");
            } else if (num >= 1) {
                num -= 1;
                s.append("I");
            }

        }
        return s.toString();
    }
}
