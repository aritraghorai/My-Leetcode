/*
 !Name: Aritra Ghorai
 !Date:19/10/2021
 ?Program Details: 1131. Maximum of Absolute Value Expression
 *https://leetcode.com/problems/maximum-of-absolute-value-expression/
   */
public class Q181_Maximum_Abstilute_Value_Expression {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = Integer.MIN_VALUE;
        int a1 = Integer.MIN_VALUE, a2 = Integer.MAX_VALUE, b1 = Integer.MIN_VALUE, b2 = Integer.MAX_VALUE,
                c1 = Integer.MIN_VALUE, c2 = Integer.MAX_VALUE, d1 = Integer.MIN_VALUE, d2 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            a1 = Math.max(a1, arr1[i] + arr2[i] + i);
            a2 = Math.min(a2, arr1[i] + arr2[i] + i);
            b1 = Math.max(b1, -arr1[i] + arr2[i] + i);
            b2 = Math.min(b2, -arr1[i] + arr2[i] + i);
            c1 = Math.max(c1, -arr1[i] + arr2[i] - i);
            c2 = Math.min(c2, -arr1[i] + arr2[i] - i);
            d1 = Math.max(d1, arr1[i] + arr2[i] - i);
            d2 = Math.min(d2, arr1[i] + arr2[i] - i);
        }
        m = Math.max(m, Math.abs(a1 - a2));
        m = Math.max(m, Math.abs(b1 - b2));
        m = Math.max(m, Math.abs(c1 - c2));
        m = Math.max(m, Math.abs(d1 - d2));
        return m;
    }
}
