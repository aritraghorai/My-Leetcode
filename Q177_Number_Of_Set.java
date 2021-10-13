/*
 !Name: Aritra Ghorai
 !Date:13/10/2021
 ?Program Details:191. Number of 1 Bits
 *https://leetcode.com/problems/number-of-1-bits/ 
   */
public class Q177_Number_Of_Set {
  public int hammingWeight(int n) {
    int count = 0;
    while (n != 0) {
      n = n & (n - 1);
      count++;

    }
    return count;
  }
}
