import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:05/08/2021
 ?Program Details: 131. Palindrome Partitioning
 *https://leetcode.com/problems/palindrome-partitioning/
   */
public class Q65PalindromePartiotion {
    static List<List<String>> result = new ArrayList<>();

    public static List<List<String>> partition(String s) {
        partition(s, new ArrayList<>());
        return result;
    }

    public static void partition(String s, List<String> rec) {
        if (s.length() == 0) {
            result.add(new ArrayList<>(rec));
            return;
        }

        for (int i = 1; i <= s.length(); i++) {
            String part1 = s.substring(0, i);
            String part2 = s.substring(i);
            if (isPlindrome(part1)) {
                rec.add(part1);
                partition(part2, rec);
                rec.remove(rec.size() - 1);
            }

        }
    }

    public static boolean isPlindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        if (s.length() == 0)
            return false;
        StringBuilder rev = new StringBuilder(s).reverse();
        return rev.toString().equals(s);
    }

    public static void main(String[] args) {
        partition("efe");
        System.out.println(result);
    }
}
