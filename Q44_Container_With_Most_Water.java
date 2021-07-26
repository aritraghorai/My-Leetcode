import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:26/07/2021
 ?Program Details:11. Container With Most Water
*https://leetcode.com/problems/container-with-most-water/
   */
public class Q44_Container_With_Most_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(maxArea(nums));
    }

    public static int maxArea(int[] height) {
        int max = 0, slow = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            slow = (j - i) * Math.min(height[i], height[j]);
            if (slow > max) {
                max = slow;
            }
            if (height[i] >= height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return max;
    }

    public static int maxAreaBrutforce(int[] height) {
        int max = 0, slow = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                slow = (j - i) * Math.min(height[i], height[j]);
                if (slow > max) {
                    max = slow;
                }
            }
        }
        return max;
    }
}
