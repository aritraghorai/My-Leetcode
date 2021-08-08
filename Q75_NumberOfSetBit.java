/*
 !Name: Aritra Ghorai
 !Date:07/08/2021
 ?Program Details: 338. Counting Bits
 *https://leetcode.com/problems/counting-bits/
   */
public class Q75_NumberOfSetBit {
    public int[] countBits(int n) {
        int[] storage = new int[n + 1];
        if (n == 0) {
            return storage;
        }
        storage[1] = 1;
        for (int i = 2; i <= n; i++) {
            if ((i & 1) == 0) {
                storage[i] = storage[i / 2];
            } else {
                storage[i] = storage[i / 2] + 1;
            }
        }
        return storage;
    }
}
