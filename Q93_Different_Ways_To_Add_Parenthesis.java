import java.util.ArrayList;
import java.util.List;

/*
 !Name: Aritra Ghorai
 !Date:13/08/2021
 ?Program Details: 241. Different Ways to Add Parentheses
 *https://leetcode.com/problems/different-ways-to-add-parentheses/
   */
public class Q93_Different_Ways_To_Add_Parenthesis {
    public static List<Integer> diffWaysToCompute(String expression) {
        return diffWaysToCompute(expression, 0, expression.length() - 1);
    }

    public static List<Integer> diffWaysToCompute(String expression, int start, int end) {
        var result = new ArrayList<Integer>();
        if (start > end) {
            return result;
        }
        boolean isAnyOperator = false;
        for (int i = start; i < end; i++) {
            if (!Character.isDigit(expression.charAt(i))) {
                isAnyOperator = true;
                var left = diffWaysToCompute(expression, start, i - 1);
                var right = diffWaysToCompute(expression, i + 1, end);
                for (int leftNum : left) {
                    for (int rightNum : right) {
                        switch (expression.charAt(i)) {
                            case '+' -> result.add(leftNum + rightNum);
                            case '-' -> result.add(leftNum - rightNum);
                            case '*' -> result.add(leftNum * rightNum);
                        }
                    }
                }
            }
        }
        if (!isAnyOperator) {
            result.add(Integer.parseInt(expression.substring(start, end + 1)));
        }
        return result;

    }

    public static void main(String[] args) {
        String s = "2*3-4*5";
        System.out.println(diffWaysToCompute(s));
    }
}
