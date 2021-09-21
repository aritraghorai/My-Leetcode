import java.util.Arrays;

/*
 !Name: Aritra Ghorai
 !Date:21/09/2021
 ?Program Details:1051. Height Checker
 *https://leetcode.com/problems/height-checker/
   */
public class Q163_Height_Chacker {
    public int heightChecker(int[] heights) {
        int[] arr = heights.clone();
        Arrays.sort(heights);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != arr[i])
                count++;
        }
        return count;
    }
}
