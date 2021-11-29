import java.util.HashSet;
import java.util.LinkedList;

/*
 !Name: Aritra Ghorai
 !Date:29/11/2021
 ?Program Details:1306. Jump Game III
 *https://leetcode.com/problems/jump-game-iii/
   */
public class Q193_Jump_Game {
    public boolean canReach(int[] arr, int start) {
        var qu = new LinkedList<Integer>();
        var set = new HashSet<Integer>();
        qu.offer(start);
        while (!qu.isEmpty()) {
            int i = qu.poll();
            set.add(i);
            if (arr[i] == 0)
                return true;
            if (i + arr[i] < arr.length && !set.contains(i + arr[i])) {
                qu.add(i + arr[i]);
            }
            if (i - arr[i] >= 0 && !set.contains(i - arr[i])) {
                qu.add(i - arr[i]);
            }
        }
        return false;
    }
}
