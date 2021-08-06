import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:06/08/2021
 ?Program Details: 455. Assign Cookies
 *https://leetcode.com/problems/assign-cookies/
   */
public class Q70AssignCookie {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        int count = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return count;
    }
}
