
import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:09/07/2021
 ?Program Details:Search Insert position Leetcode
   */
public class Q4InsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        sc.close();
        System.out.println(searchInsert(nums, b));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int mid = ((i + j) / 2);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }

        }
        if (nums[i] < target)
            return i + 1;
        return i;
    }
}
