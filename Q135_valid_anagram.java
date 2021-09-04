import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:04/09/2021
 ?Program Details:242. Valid Anagram
 *https://leetcode.com/problems/valid-anagram/
   */
public class Q135_valid_anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(isAnagram(s, t));
        sc.close();

    }

    public static boolean isAnagramSlow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                if (map.get(t.charAt(i)) != 1)
                    map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                else {
                    map.remove(t.charAt(i));
                }
            } else {
                return false;
            }
        }
        if (map.size() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] freqA1 = new int[26];
        int[] freqA2 = new int[26];
        char[] arr1 = s.toCharArray();
        char[] arr2 = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            freqA1[arr1[i] - 'a']++;
            freqA2[arr2[i] - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freqA1[i] != freqA2[i]) {
                return false;
            }
        }
        return true;
    }
}
