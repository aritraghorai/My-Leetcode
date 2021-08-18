import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:18/08/2021
 ?Program Details: 219. Contains Duplicate II
 *https://leetcode.com/problems/contains-duplicate-ii/
   */
public class Q100_ContainDuplicate2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> isPresent = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!isPresent.containsKey(nums[i])) {
                isPresent.put(nums[i], i);
            } else {
                int val = Math.abs(isPresent.get(nums[i]) - i);
                if (val <= k) {
                    return true;
                }
                isPresent.put(nums[i], i);
            }
        }
        return false;
    }
}
