/*
 !Name: Aritra Ghorai
 !Date:08/09/2021
 ?Program Details:1539. Kth Missing Positive Number
 *https://leetcode.com/problems/kth-missing-positive-number/ 
   */
public class Q147_kth_missing_positive {
    // *Using Linear Search
    public int findKthPositiveLinear(int[] arr, int k) {
        int max = arr[arr.length - 1];
        int index = 0;
        for (int i = 1; i <= max; i++) {
            if (i == arr[index]) {
                index++;
            } else {
                if (k == 0) {
                    return i;
                }
                k--;
            }

        }
        return max + k;
    }

    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (arr[mid] - mid - 1 < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low + k;
    }
}
