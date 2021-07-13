import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:13/07/2021
 ?Program Details:13.Roman to Integer
 *https://leetcode.com/problems/roman-to-integer/
   */
public class Q15RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int result = 0;
        boolean fx = false, fv = false, fl = false, fc = false, fd = false, fm = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            int c = s.charAt(i);
            switch (c) {
                case 'I':
                    if (fv || fx)
                        result = result - 1;
                    else
                        result = result + 1;
                    break;
                case 'V':
                    result += 5;
                    fv = true;
                    break;
                case 'X':
                    fx = true;
                    if (fl || fc)
                        result = result - 10;
                    else
                        result = result + 10;
                    break;
                case 'L':
                    result += 50;
                    fl = true;
                    break;
                case 'C':
                    fc = true;
                    if (fd || fm)
                        result = result - 100;
                    else
                        result = result + 100;
                    break;
                case 'D':
                    result += 500;
                    fd = true;
                    break;
                case 'M':
                    result += 1000;
                    fm = true;
                    break;
            }
        }
        return result;
    }

}
