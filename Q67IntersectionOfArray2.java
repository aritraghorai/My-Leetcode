import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:05/08/2021
 ?Program Details: 
   */
public class Q67IntersectionOfArray2 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        var result = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return result.stream().mapToInt(k -> k).toArray();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }
        int n1 = sc.nextInt();
        int[] nums2 = new int[n1];
        for (int i = 0; i < n1; i++) {
            nums2[i] = sc.nextInt();
        }
        sc.close();
        int[] result = intersect(nums1, nums2);
        for (int a : result) {
            System.out.print(a + " ");
        }

    }
}
