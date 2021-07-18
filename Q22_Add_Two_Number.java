
import java.util.Scanner;

import MyOwnDataStructure.*;

/*
!Name: Aritra Ghorai
!Date:17/07/2021
 ?Program Details:2. Add Two Numbers
 *https://leetcode.com/problems/add-two-numbers/
 */
public class Q22_Add_Two_Number {
    public static void main(String[] args) throws Exception {
        MyLinkedList l1 = new MyLinkedList();
        MyLinkedList l2 = new MyLinkedList();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int j = sc.nextInt();
        int num = 0;
        for (int i = 0; i < a; i++) {
            num = sc.nextInt();
            l1.addLast(num);
        }
        for (int i = 0; i < j; i++) {
            num = sc.nextInt();
            l2.addLast(num);
        }
        sc.close();
        MyLinkedList nn = new MyLinkedList();
        nn.head = addTwoNumbers(l1.head, l2.head);
        nn.Display();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode temp = result;
        int sum = 0, carry = 0;
        while (l1 != null && l2 != null) {
            if (carry == 0)
                sum = l1.val + l2.val;
            else if (carry == 1)
                sum = l1.val + l2.val + 1;

            if (sum > 9) {
                carry = 1;
                sum = sum % 10;
            } else {
                carry = 0;
            }
            ListNode nn = new ListNode(sum);
            temp.next = nn;
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l2 == null && l1 != null) {
            while (l1 != null) {
                ListNode nn = new ListNode();

                if (carry == 1) {
                    sum = l1.val + 1;
                } else {
                    sum = l1.val;
                }
                if (sum > 9) {
                    sum = sum % 10;
                    carry = 1;
                } else {
                    carry = 0;
                }
                nn.val = sum;
                temp.next = nn;
                l1 = l1.next;
                temp = temp.next;
            }
        }
        if (l2 != null && l1 == null) {
            while (l2 != null) {
                ListNode nn = new ListNode();

                if (carry == 1) {
                    sum = l2.val + 1;
                } else {
                    sum = l2.val;
                }
                if (sum > 9) {
                    sum = sum % 10;
                    carry = 1;
                } else {
                    carry = 0;
                }
                nn.val = sum;
                temp.next = nn;
                l2 = l2.next;
                temp = temp.next;
            }
        }

        if (carry == 1) {

            ListNode nn = new ListNode(1);
            temp.next = nn;
        }

        return result.next;
    }
}
