
import java.util.Scanner;
import java.util.Stack;

/*
 !Name: Aritra Ghorai
 !Date:13/07/2021
 ?Program Details:20. Valid Parentheses
 *https://leetcode.com/problems/valid-parentheses/
   */
public class Q17_ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        if (s.length() == 0 || s.length() == 1)
            return false;
        Stack<Character> S = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                S.push(s.charAt(i));
            } else if (!S.isEmpty()) {
                if (s.charAt(i) == ')' && S.peek() == '(') {
                    S.pop();
                } else if (s.charAt(i) == '}' && S.peek() == '{') {
                    S.pop();
                } else if (s.charAt(i) == ']' && S.peek() == '[') {
                    S.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return S.isEmpty();
    }
}
