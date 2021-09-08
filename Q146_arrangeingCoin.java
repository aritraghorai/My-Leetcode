/*
 !Name: Aritra Ghorai
 !Date:08/09/2021
 ?Program Details:441. Arranging Coins
*https://leetcode.com/problems/arranging-coins/
   */
public class Q146_arrangeingCoin {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }

    public static int arrangeCoins(int n) {
        long low = 1, high = n;
        while (low <= high) {
            long mid = low + ((high - low) >> 1);
            long cal = (mid * (mid + 1)) >> 1;
            if (cal == n) {
                return (int) mid;
            } else if (cal > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return (int) high;
    }
}
