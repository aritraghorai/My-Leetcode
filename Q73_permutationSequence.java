import java.util.*;

/*
 !Name: Aritra Ghorai
 !Date:06/08/2021
 ?Program Details: 60. Permutation Sequence
 *https://leetcode.com/problems/permutation-sequence/
   */
public class Q73_permutationSequence {
    public static String getPermutation(int n, int k) {
        var list = new ArrayList<Integer>();
        int fact = 1;
        int i = 0;
        for (i = 1; i < n; i++) {
            list.add(i);
            fact *= i;
        }
        list.add(i);
        StringBuilder s = new StringBuilder();
        k--;
        while (true) {
            s.append(list.get(k / fact));
            list.remove(k / fact);
            if (list.isEmpty()) {
                break;
            }
            k = k % fact;
            fact /= list.size();
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(getPermutation(3, 3));
    }
}
