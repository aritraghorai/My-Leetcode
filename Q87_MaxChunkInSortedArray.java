/*
 !Name: Aritra Ghorai
 !Date:10/08/2021
 ?Program Details: 769. Max Chunks To Make Sorted
 *https://leetcode.com/problems/max-chunks-to-make-sorted/
   */
public class Q87_MaxChunkInSortedArray {
    public int maxChunksToSorted(int[] arr) {
        int max = Integer.MIN_VALUE;
        int chunk = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            if (max == i) {
                chunk++;
            }
        }
        return chunk;
    }
}
