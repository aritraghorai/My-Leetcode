import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:12/07/2021
 ?Program Details:Find the Duplicate Number 
 *https://leetcode.com/problems/find-the-duplicate-number/
   */
public class Q14_FindDuplicateElimentInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(findDuplicate(nums));
        sc.close();
    }

    public static int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        fast = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}
