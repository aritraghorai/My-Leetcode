import java.util.Stack;

/*
 !Name: Aritra Ghorai
 !Date:11/09/2021
 ?Program Details:227. Basic Calculator II
 *https://leetcode.com/problems/basic-calculator-ii/ 
   */
public class Q156_basic_calculator {
    public int calculate(String s) {
        int calculate = 0;
        char sign = '+';
        Stack<Integer> stack = new Stack<>();
        for (char a : s.toCharArray()) {
            if (a == ' ')
                continue;
            if (Character.isDigit(a)) {
                calculate = calculate * 10 + a - '0';
                continue;
            }
            switch (sign) {
                case '+' -> stack.push(calculate);
                case '-' -> stack.push((-1) * calculate);
                case '*' -> stack.push(stack.pop() * calculate);
                case '/' -> stack.push(stack.pop() / calculate);
            }
            calculate = 0;
            sign = a;
        }
        int res = 0;
        for (int a : stack) {
            res += a;
        }
        return res;
    }
}
