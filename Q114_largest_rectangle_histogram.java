import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:23/08/2021
 ?Program Details:84. Largest Rectangle in Histogram
 *https://leetcode.com/problems/largest-rectangle-in-histogram/
   */
public class Q114_largest_rectangle_histogram {
    public static int largestRectangleArea(int[] heights) {
        LinkedList<Integer> stack = new LinkedList<>();
        int[] left = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            if (stack.isEmpty()) {
                stack.addFirst(i);
                left[i] = 0;
            } else {
                while (!stack.isEmpty() && heights[stack.peek()] >= heights[i])
                    stack.removeFirst();
                left[i] = stack.isEmpty() ? 0 : stack.peek() + 1;
                stack.addFirst(i);
            }
        }
        stack.clear();
        int[] right = new int[heights.length];
        for (int i = heights.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                stack.addFirst(i);
                right[i] = heights.length - 1;
            } else {
                while (!stack.isEmpty() && heights[stack.peek()] >= heights[i])
                    stack.removeFirst();
                right[i] = stack.isEmpty() ? heights.length - 1 : stack.peek() - 1;
                stack.addFirst(i);
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            int area = (right[i] - left[i] + 1) * heights[i];
            if (area > max) {
                max = area;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(largestRectangleArea(nums));
    }
}
