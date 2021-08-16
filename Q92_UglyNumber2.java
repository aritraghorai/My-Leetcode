/*
 !Name: Aritra Ghorai
 !Date:12/08/2021
 ?Program Details: Ugly Number II
 *https://leetcode.com/problems/ugly-number-ii/
   */
public class Q92_UglyNumber2 {
    public static int nthUglyNumber(int n) {
        int[] storage = new int[n + 1];
        storage[0] = 1;
        int a2 = 0, a3 = 0, a5 = 0;
        for (int i = 1; i <= n; i++) {
            storage[i] = Math.min(storage[a2] * 2, Math.min(storage[a3] * 3, storage[a5] * 5));
            if (storage[i] == storage[a2] * 2) {
                a2++;
            }
            if (storage[i] == storage[a3] * 3) {
                a3++;
            }
            if (storage[i] == storage[a5] * 5) {
                a5++;
            }

        }
        return storage[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }
}
