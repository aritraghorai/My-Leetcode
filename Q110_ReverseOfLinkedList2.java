import MyOwnDataStructure.ListNode;

/*
 !Name: Aritra Ghorai
 !Date:22/08/2021
 ?Program Details: 92. Reverse Linked List II
 *https://leetcode.com/problems/reverse-linked-list-ii/
   */
public class Q110_ReverseOfLinkedList2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null)
            return head;
        ListNode pre = null;
        ListNode curreNode = head;
        while (left > 1) {
            pre = curreNode;
            curreNode = curreNode.next;
            left--;
            right--;
        }
        ListNode connection = pre;
        ListNode tail = curreNode;
        while (right > 0) {
            ListNode next = curreNode.next;
            curreNode.next = pre;
            pre = curreNode;
            curreNode = next;
            right--;
        }

        if (connection != null) {
            connection.next = pre;
        } else {
            head = pre;
        }
        tail.next = curreNode;
        return head;

    }

}
