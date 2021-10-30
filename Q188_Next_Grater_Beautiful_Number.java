/*
 !Name: Aritra Ghorai
 !Date:30/10/2021
 ?Program Details:2048. Next Greater Numerically Balanced Number
 *https://leetcode.com/problems/next-greater-numerically-balanced-number/
   */
public class Q188_Next_Grater_Beautiful_Number {
    public int nextBeautifulNumber(int n) {
        while (true) {
            if (isBeautiful(++n))
                return n;
        }
    }

    private boolean isBeautiful(int i) {
        int[] digitsFreq = new int[10];
        while (i > 0) {
            int temp = i % 10;
            if (temp == 0)
                return false;
            digitsFreq[temp]++;
            i /= 10;
        }
        for (int n = 0; n <= 9; n++) {
            if (digitsFreq[n] != 0 && digitsFreq[n] != n)
                return false;
        }
        return true;
    }
}
