import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:29/11/2021
 ?Program Details:797. All Paths From Source to Target
 *https://leetcode.com/problems/all-paths-from-source-to-target/
   */
public class Q192_All_Paths_From_Source {
    // *using Bfs
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        var qu = new LinkedList<List<Integer>>();
        var res = new ArrayList<List<Integer>>();

        var li = new ArrayList<Integer>();
        li.add(0);
        qu.add(li);
        while (!qu.isEmpty()) {
            var rl = qu.poll();
            int num = rl.get(rl.size() - 1);
            if (num == graph.length - 1) {
                res.add(new ArrayList<>(rl));
                continue;
            }
            for (int nu : graph[num]) {
                rl.add(nu);
                qu.offer(new ArrayList<>(rl));
                rl.remove(rl.size() - 1);
            }
        }
        return res;
    }
}
