/*
 !Name: Aritra Ghorai
 !Date:26/09/2021
 ?Program Details:1491. Average Salary Excluding the Minimum and Maximum Salary
 *https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/ 
   */
public class Q167_AverageSalary {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double res = 0.0;
        for (int a : salary) {
            res += a;
            min = Math.min(min, a);
            max = Math.max(max, a);
        }
        res -= min;
        res -= max;
        return res / ((salary.length - 2) * 1.0);
    }
}
