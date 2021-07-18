
import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:09/07/2021
 ?Program Details:Merge To Sorted Array
   */
public class Q7MergeToSortedArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    int n1 = sc.nextInt();
    int[] nums1 = new int[n];
    for (int i = 0; i < n1; i++) {
      nums1[i] = sc.nextInt();
    }
    sc.close();
    merge(nums, 3, nums1, n1);
    for (int a : nums) {
      System.out.print(a + " ");
    }
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    if (n == 0) {
      return;
    }
    m--;
    n--;
    int index = nums1.length - 1;
    while (index >= 0) {
      if (m < 0) {
        nums1[index] = nums2[n--];
      } else if (n < 0) {
        nums1[index] = nums1[m--];
      } else {
        if (nums1[m] > nums2[n]) {
          nums1[index] = nums1[m--];
        } else {
          nums1[index] = nums2[n--];
        }
      }
      index--;
    }

  }

}
