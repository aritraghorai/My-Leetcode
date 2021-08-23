/*
 !Name: Aritra Ghorai
 !Date:23/08/2021
 ?Program Details: 42. Trapping Rain Water
 *https://leetcode.com/problems/trapping-rain-water/
   */
public class Q112_TappingRainWater {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;
        while (left < right) {
            if (height[left] <= height[right]) {
                if (leftMax < height[left]) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (rightMax < height[right]) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }
        return water;
    }
}
