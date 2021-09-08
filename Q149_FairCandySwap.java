/*
 !Name: Aritra Ghorai
 !Date:08/09/2021
 ?Program Details: 888. Fair Candy Swap
 *https://leetcode.com/problems/fair-candy-swap/
   */
public class Q149_FairCandySwap {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = 0, bobSum = 0;
        for (int a : aliceSizes)
            aliceSum += a;
        for (int a : bobSizes)
            bobSum += a;
        int diff = (aliceSum - bobSum) >> 1;
        int[] arr = new int[2];
        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                if (aliceSizes[i] == bobSizes[j] + diff) {
                    arr[0] = aliceSizes[i];
                    arr[1] = bobSizes[j];
                    return arr;
                }

            }
        }
        return arr;
    }
}
