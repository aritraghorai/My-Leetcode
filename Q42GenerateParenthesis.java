import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:25/07/2021
 ?Program Details:22. Generate Parentheses 
 *https://leetcode.com/problems/generate-parentheses/
   */
public class Q42GenerateParenthesis {
  public static void main(String[] args) {
    System.out.println(generateParenthesis(3));
  }

  static List<String> result = new ArrayList<>();

  public static List<String> generateParenthesis(int n) {
    generateParenthesis(n, n, "");
    return result;
  }

  public static void generateParenthesis(int open, int close, String s) {
    if (open == 0 && close == 0) {
      result.add(s);
      return;
    }

    if (open > 0)
      generateParenthesis(open - 1, close, s + "(");
    if (close > open && close > 0)
      generateParenthesis(open, close - 1, s + ")");

  }
}
