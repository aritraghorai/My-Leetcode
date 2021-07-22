import java.util.HashMap;
import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:22/07/2021
 ?Program Details:217. Contains Duplicate
 *https://leetcode.com/problems/contains-duplicate/
   */
public class Q35_Duplicate_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return false;
            } else {
                map.put(nums[i], i);
            }
        }
        return true;

    }
}
