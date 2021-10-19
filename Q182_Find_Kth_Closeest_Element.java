import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:19/10/2021
 ?Program Details:658. Find K Closest Elements
 *https://leetcode.com/problems/find-k-closest-elements/
   */
public class Q182_Find_Kth_Closeest_Element {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a, b) -> Math.abs(a - x) == Math.abs(b - x) ? a - b : Math.abs(a - x) - Math.abs(b - x));
        for (int i : arr) {
            if (pq.size() < k)
                pq.add(i);
            else {
                pq.poll();
                pq.add(i);
            }
        }
        var res = new ArrayList<Integer>();
        while (k-- > 0)
            res.add(pq.poll());
        Collections.sort(res);
        return res;

    }

}
