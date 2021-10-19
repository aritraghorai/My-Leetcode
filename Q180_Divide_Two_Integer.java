/*
 !Name: Aritra Ghorai
 !Date:17/10/2021
 ?Program Details:29. Divide Two Integers
 *https://leetcode.com/problems/divide-two-integers/ 
   */
public class Q180_Divide_Two_Integer {
    public static void main(String[] args) {
        System.out.println(divide(43, 8));
    }

    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MAX_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        boolean sign = dividend < 0 ^ divisor < 0;
        int m = Math.abs(dividend);
        int n = Math.abs(divisor);
        int res = 0;
        while (m - n >= 0) {
            int count = 0;
            while ((m - (n << 1 << count)) >= 0) {
                count++;
            }
            res += 1 << count;
            m -= n << count;
        }
        return sign ? -res : res;
    }
}
