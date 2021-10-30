import java.util.LinkedList;

/*
 !Name: Aritra Ghorai
 !Date:29/10/2021
 ?Program Details:994. Rotting Oranges
 *https://leetcode.com/problems/rotting-oranges/
   */
public class Q186_Rotten_Oranges {
    public int orangesRotting(int[][] grid) {
        var q = new LinkedList<int[]>();
        int numerOfFreshOranges = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[] { i, j });
                } else if (grid[i][j] == 1)
                    numerOfFreshOranges++;
            }
        }
        if (numerOfFreshOranges == 0)
            return 0;
        if (q.isEmpty())
            return -1;
        int count = 1;
        int[][] arr = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };
        while (!q.isEmpty()) {
            int si = q.size();
            while (si-- > 0) {
                var ri = q.poll();
                for (int i = 0; i < 4; i++) {
                    int x = arr[i][0] + ri[0];
                    int y = arr[i][1] + ri[1];
                    if (x == -1 || y == -1 || x == grid.length || y == grid[0].length || grid[x][y] != 1)
                        continue;

                    numerOfFreshOranges--;
                    grid[x][y] = 2;
                    q.offer(new int[] { x, y });
                }
            }
            if (numerOfFreshOranges == 0)
                return count;
            count++;
        }
        return numerOfFreshOranges == 0 ? count : -1;
    }
}
