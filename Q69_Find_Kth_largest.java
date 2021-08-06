import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:05/08/2021
 ?Program Details: 215. Kth Largest Element in an Array
 *https://leetcode.com/problems/kth-largest-element-in-an-array/
   */
public class Q69_Find_Kth_largest {
    public static int findKthLargest(int[] nums, int k) {
        var q = new PriorityQueue<Integer>();
        for (int a : nums) {
            q.offer(a);
            if (q.size() > 3) {
                q.poll();
            }
        }
        return q.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();
        System.out.println(findKthLargest(nums, k));
    }
}
