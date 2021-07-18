/*
 !Name: Aritra Ghorai
 !Date:17/07/2021
 ?Program Details:3.Longest Substring Without Repeating Characters
 *https://leetcode.com/problems/longest-substring-without-repeating-characters/
   */

import java.util.HashMap;
import java.util.Scanner;

public class Q23_LongestSubStringWithoutRepeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(lengthOfLongestSubstring(s));
        sc.close();
    }

    public static int lengthOfLongestSubstringSlow(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        int max = 0;
        while (i < s.length() && j < s.length()) {
            if (!map.containsKey(s.charAt(j)) && j < s.length()) {
                map.put(s.charAt(j), 1);
                j++;
            } else {

                max = Math.max(max, j - i);
                map.clear();
                i = i + 1;
                j = i;

            }

        }
        max = Math.max(max, j - i);
        return max;

    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        int max = 0;
        while (i < s.length() && j < s.length()) {
            if (map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
            } else {
                map.put(s.charAt(j), 1);
            }
            if (map.size() == (j - i + 1)) {
                max = Math.max(j - i + 1, max);
                j++;
            } else if (map.size() < (j - i + 1)) {
                while ((j - i + 1) > map.size()) {
                    if (map.get(s.charAt(i)) == 1) {
                        map.remove(s.charAt(i));
                    } else {
                        map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    }
                    i++;
                }
                j++;
            }
        }

        return max;

    }
}
