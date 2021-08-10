import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:09/08/2021
 ?Program Details:229. Majority Element II
 *https://leetcode.com/problems/majority-element-ii/
   */
public class Q85_MajorityElement2 {
  public static List<Integer> majorityElement(int[] nums) {
    var result = new ArrayList<Integer>();
    if (nums.length == 0) {
      return result;
    }
    int val1 = 0;
    int val2 = 0;
    int count1 = 0;
    int count2 = 0;
    for (int i = 0; i < nums.length; i++) {
      if (count1 > 0 && count2 > 0) {
        if (val1 == nums[i]) {
          count1++;
        } else if (val2 == nums[i]) {
          count2++;
        } else {
          count1--;
          count2--;
        }
      } else if (count1 > 0) {
        if (val1 == nums[i]) {
          count1++;
        } else {
          val2 = nums[i];
          count2 = 1;
        }
      } else if (count2 > 0) {
        if (val2 == nums[i]) {
          count2++;
        } else {
          val1 = nums[i];
          count1++;
        }
      } else {
        val1 = nums[i];
        count1 = 1;
      }
    }
    count1 = 0;
    count2 = 0;
    for (int a : nums) {
      if (a == val1)
        count1++;
      else if (a == val2)
        count2++;
    }
    if (count1 > (nums.length / 3)) {
      result.add(val1);
    }
    if (count2 > (nums.length / 3)) {
      result.add(val2);
    }
    return result;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    var result = majorityElement(nums);
    for (int a : result) {
      System.out.print(a + " ");
    }
    sc.close();
  }
}
