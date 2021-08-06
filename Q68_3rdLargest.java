/*
 !Name: Aritra Ghorai
 !Date:05/08/2021
 ?Program Details: 
   */
public class Q68_3rdLargest {
  public int thirdMax(int[] nums) {
    Integer max = null, secondMax = null, thirdMaxN = null;
    for (Integer a : nums) {
      if (a.equals(max) || a.equals(secondMax) || a.equals(thirdMaxN))
        continue;
      if (max == null || a > max) {
        thirdMaxN = secondMax;
        secondMax = max;
        max = a;
      } else if (secondMax == null || a > secondMax) {
        thirdMaxN = secondMax;
        secondMax = a;
      } else if (thirdMaxN == null || a > thirdMaxN) {
        thirdMaxN = a;
      }
    }

    if (thirdMaxN == null) {
      return max;
    }
    return thirdMaxN;
  }

  public static void main(String[] args) {

  }
}
