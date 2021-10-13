import java.util.ArrayList;
import java.util.LinkedList;

/*
 !Name: Aritra Ghorai
 !Date:09/10/2021
 ?Program Details:¸834. Sum of Distances in Tree
 *https://leetcode.com/problems/sum-of-distances-in-tree/
   */
public class Q175_Sum_of_distance_in_tree {

    private ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
    int[] count;
    int[] ans;

    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        count = new int[n];
        ans = new int[n];
        for (int i = 0; i < n; i++) {
            tree.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            tree.get(u).add(v);
            tree.get(v).add(u);
        }
        // *we use src node as 0th node
        int src = 0;
        // *Calculate Count Using Dfs
        dfs(src, new boolean[n]);
        bfs(src, new boolean[n]);
        calculateAns(src, new boolean[n], n);
        return ans;
    }

    private void calculateAns(int src, boolean[] visit, int n) {
        var q = new LinkedList<Integer>();
        q.offer(src);
        visit[src] = true;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int parent = q.pop();
                var children = tree.get(parent);
                for (int child : children) {
                    if (visit[child] == false) {
                        ans[child] = ans[parent] - count[child] + n - count[child];
                        visit[child] = true;
                        q.offer(child);
                    }
                }
            }
        }
    }

    private void bfs(int src, boolean[] visit) {
        var q = new LinkedList<Integer>();
        q.offer(src);
        visit[src] = true;
        int level = 0;
        while (!q.isEmpty()) {
            int si = q.size();
            while (si-- > 0) {
                var rn = q.pop();
                ans[src] += level;
                var children = tree.get(rn);
                for (int child : children) {
                    if (visit[child] == false) {
                        q.offer(child);
                        visit[child] = true;
                    }
                }
            }
            level++;
        }
    }

    private int dfs(int src, boolean[] visit) {
        visit[src] = true;
        var children = tree.get(src);
        for (var child : children) {
            if (visit[child] == false) {
                int temp = dfs(child, visit);
                count[src] += temp;
            }
        }
        count[src] += 1;
        return count[src];
    }
}
