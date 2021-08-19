import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:19/08/2021
 ?Program Details: 17. Letter Combinations of a Phone Number
*https://leetcode.com/problems/letter-combinations-of-a-phone-number/
   */
public class Q103_Letter_CombinationOfPhoneNumber {
    public static void main(String[] args) {
        String a = "236";
        System.out.println(letterCombinations(a));
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }
        String[] arr = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        return helper(digits, arr, 0);

    }

    public static List<String> helper(String digits, String[] arr, int indx) {
        if (indx == digits.length()) {
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        var rec = helper(digits, arr, indx + 1);
        int a = Character.getNumericValue(digits.charAt(indx));
        List<String> result = new ArrayList<>();
        for (char ch : arr[a].toCharArray()) {
            for (String recS : rec) {
                result.add(ch + recS);
            }
        }
        return result;
    }
}
