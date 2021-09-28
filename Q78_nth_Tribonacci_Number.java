/*
 !Name: Aritra Ghorai
 !Date:08/08/2021
 ?Program Details:1137. N-th Tribonacci Number
 *https://leetcode.com/problems/n-th-tribonacci-number/
   */
public class Q78_nth_Tribonacci_Number {
    public int tribonacci(int n) {
        switch (n) {
            case 0:
                return 0;

            case 1:
                return 1;

            case 2:
                return 1;

        }
        int[] storage = new int[3];
        storage[0] = 0;
        storage[1] = 1;
        storage[2] = 1;
        for (int i = 3; i <= n; i++) {
            int cal = storage[0] + storage[1] + storage[2];
            storage[0] = storage[1];
            storage[1] = storage[2];
            storage[2] = cal;
        }
        return storage[2];

    }
}
