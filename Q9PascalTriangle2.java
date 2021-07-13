import java.util.ArrayList;
import java.util.List;

/*
 !Name: Aritra Ghorai
 !Date:10/07/2021
 ?Program Details:Pascal Triangle 2 Problem
*Important Node:In Pascal Triangle the nth row rth colm value is  (n-1)C(r-1)
   */
public class Q9PascalTriangle2 {
    public static void main(String[] args) {
        System.out.println(getRow(30));
        // System.out.println(ncr(4, 0));
    }

    public static List<Integer> getRowMy(int rowIndex) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            int n = rowIndex, r = i;
            if ((n - r) < r)
                r = n - r;
            int number = 1;
            for (int j = 0; j < r; j++) {
                number *= (n - j);
                number /= (j + 1);
            }
            result.add(number);
        }
        return result;
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        int number = 1;
        int j = rowIndex;
        for (int i = 0; i <= j; i++) {
            result.add(number);
            long a = number;
            a *= (j - i);
            a /= (i + 1);
            number = (int) a;
        }
        return result;
    }

}
