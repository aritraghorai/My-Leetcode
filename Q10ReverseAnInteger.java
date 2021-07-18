
import java.util.Scanner;

public class Q10ReverseAnInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println(reverse(a));
    }

    public static int reverse(int x) {

        long newNum = 0;

        while (x != 0) {
            int rem = x % 10;
            x /= 10;

            newNum = (newNum * 10) + rem;
        }
        if (newNum > Integer.MAX_VALUE || newNum < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) newNum;
    }
}
