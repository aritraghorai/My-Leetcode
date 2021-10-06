import java.util.Scanner;

/*
 !Name: Aritra Ghorai
 !Date:02/10/2021
 ?Program Details:983. Minimum Cost For Tickets
 *https://leetcode.com/problems/minimum-cost-for-tickets/
   */
public class Q169_Minimum_Cost_For_Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        var prices = new int[3];
        for (int i = 0; i < 3; i++)
            prices[i] = sc.nextInt();
        sc.close();
        System.out.println(mincostTickets(nums, prices));
    }

    public static int mincostTickets(int[] days, int[] costs) {
        var isTravel = new boolean[366];
        for (int day : days)
            isTravel[day] = true;

        return mincostTicketsRec(days, costs, isTravel, new Integer[366], 0);

    }

    public static int mincostTicketsRec(int[] days, int[] costs, boolean[] isTravel, Integer[] storage, int day) {
        if (day > days[days.length - 1] || day > 365) {
            return 0;
        }
        if (storage[day] != null)
            return storage[day];
        int ans = Integer.MAX_VALUE;
        if (isTravel[day]) {
            ans = Math.min(ans, mincostTicketsRec(days, costs, isTravel, storage, day + 1) + costs[0]);
            ans = Math.min(ans, mincostTicketsRec(days, costs, isTravel, storage, day + 7) + costs[1]);
            ans = Math.min(ans, mincostTicketsRec(days, costs, isTravel, storage, day + 30) + costs[2]);
        } else {
            ans = mincostTicketsRec(days, costs, isTravel, storage, day + 1);
        }
        return storage[day] = ans;
    }
}
