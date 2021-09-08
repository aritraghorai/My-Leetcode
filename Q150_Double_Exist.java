import java.util.HashSet;

/*
 !Name: Aritra Ghorai
 !Date:08/09/2021
 ?Program Details:1346. Check If N and Its Double Exist
 *https://leetcode.com/problems/check-if-n-and-its-double-exist/ 
   */
public class Q150_Double_Exist {
    public static void main(String[] args) {
        int[] arr = { 10, 2, 5, 3 };
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        var set = new HashSet<Integer>();
        for (int a : arr) {
            if (a == 0 && set.contains(0)) {
                return true;
            }
            set.add(a);
        }
        for (int a : arr) {
            if (a != 0 && set.contains(a * 2)) {
                return true;
            }
        }
        return false;
    }
}
