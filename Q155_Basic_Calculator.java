import java.util.Stack;

/*
 !Name: Aritra Ghorai
 !Date:11/09/2021
 ?Program Details:Basic Calculator 
 *https://leetcode.com/problems/basic-calculator/
   */
public class Q155_Basic_Calculator {
  public int calculate(String s) {
    int sum = 0, sign = 1;
    char[] a = s.toCharArray();
    var stack = new Stack<Integer>();
    for (int i = 0; i < a.length; i++) {
      if (Character.isDigit(a[i])) {
        int val = 0;
        while (i < s.length() && Character.isDigit(a[i])) {
          val = val * 10 + a[i] - '0';
          i++;
        }
        i--;
        val *= sign;
        sign = 1;
        sum += val;
      } else if (a[i] == '(') {
        stack.push(sum);
        stack.push(sign);
        sum = 0;
        sign = 1;
      } else if (a[i] == ')') {
        sum *= stack.pop();
        sum += stack.pop();
      } else if (a[i] == '-') {
        sign = -1;
      }
    }
    return sum;
  }
}
