import java.util.ArrayList;
import java.util.List;

public class Q8_PascalTriangle {
    public static void main(String[] args) {
        List<List<Integer>> result = generate(6);
        System.out.println(result);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            result.add(new ArrayList<Integer>());
            for (int j = 0; j < i + 1; j++) {
                result.get(i).add(1);
            }
        }
        for (int i = 2; i < numRows; i++) {
            List<Integer> pre = result.get(i - 1);
            List<Integer> li = result.get(i);
            for (int j = 1; j < i; j++) {
                li.remove(j);
                li.add(j, (pre.get(j - 1) + pre.get(j)));
            }
        }
        return result;
    }
}
