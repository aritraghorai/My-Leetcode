import java.util.List;

/*
 !Name: Aritra Ghorai
 !Date:11/08/2021
 ?Program Details:263.Ugly Number
 *https://leetcode.com/problems/ugly-number/
   */
public class Q89_Is_Ugly_number {
    public static boolean isUgly(int n) {
        var list = List.of(2, 3, 5);
        for (int a : list) {
            while (n % a == 0) {
                n /= a;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(4));
    }
}
