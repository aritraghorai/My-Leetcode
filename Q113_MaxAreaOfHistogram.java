import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:23/08/2021
 ?Program Details: 
 *https://leetcode.com/problems/maximal-rectangle/
   */
public class Q113_MaxAreaOfHistogram {
  public static int maximalRectangle(char[][] matrix) {
    if (matrix.length == 0) {
      return 0;
    }
    int[] arr = new int[matrix[0].length];
    int maxArea = Integer.MIN_VALUE;
    for (int row = 0; row < matrix.length; row++) {
      for (int colm = 0; colm < matrix[0].length; colm++) {
        if (matrix[row][colm] == '0') {
          arr[colm] = 0;
        } else {
          arr[colm] = arr[colm] + 1;
        }
      }
      int area = largestRectangleArea(arr);
      maxArea = Math.max(area, maxArea);
    }
    return maxArea;
  }

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
}
