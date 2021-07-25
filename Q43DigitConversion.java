import java.util.HashMap;

/*
 !Name: Aritra Ghorai
 !Date:25/07/2021
 ?Program Details: 1945. Sum of Digits of String After Convert
   */
public class Q43DigitConversion {
    public static void main(String[] args) {

    }

    public static int getLucky(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        map.put('f', 6);
        map.put('g', 7);
        map.put('h', 8);
        map.put('i', 9);
        map.put('j', 10);
        map.put('k', 11);
        map.put('l', 12);
        map.put('m', 13);
        map.put('n', 14);
        map.put('o', 15);
        map.put('p', 16);
        map.put('q', 17);
        map.put('r', 18);
        map.put('s', 19);
        map.put('t', 20);
        map.put('u', 21);
        map.put('v', 22);
        map.put('w', 23);
        map.put('x', 24);
        map.put('y', 25);
        map.put('z', 26);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int a = map.get(s.charAt(i));
            while (a != 0) {
                int temp = a % 10;
                result += temp;
                a /= 10;
            }
        }

        for (int i = 0; i < k - 1; i++) {
            if (result < 10)
                break;
            int m = result;
            result = 0;
            while (m != 0) {
                int temp = m % 10;
                result += temp;
                m /= 10;
            }
        }
        return result;
    }
}
