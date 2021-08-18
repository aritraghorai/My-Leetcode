/*
 !Name: Aritra Ghorai
 !Date:18/08/2021
 ?Program Details:453. Minimum Moves to Equal Array Elements
 *https://leetcode.com/problems/minimum-moves-to-equal-array-elements/ 
   */
public class Q101_Minimum_moves_toequal {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int a : nums) {
            if (min > a)
                min = a;
        }
        int result = 0;
        for (int a : nums)
            result += a - min;
        return result;
    }
}
