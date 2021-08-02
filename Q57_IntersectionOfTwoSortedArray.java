import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 !Name: Aritra Ghorai
 !Date:31/07/2021
 ?Program Details:349. Intersection of Two Arrays
 *https://leetcode.com/problems/intersection-of-two-arrays/
   */
public class Q57_IntersectionOfTwoSortedArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> inter = new ArrayList<>();
        Map<Integer, Boolean> track = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            track.put(nums1[i], true);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (track.containsKey(nums2[i])) {
                if (track.get(nums2[i]) == true) {
                    inter.add(nums2[i]);
                    track.put(nums2[i], false);
                }
            }
        }

        return inter.stream().mapToInt(i -> i).toArray();
    }
}
