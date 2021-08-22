import MyOwnDataStructure.*;

/*
 !Name: Aritra Ghorai
 !Date:22/08/2021
 ?Program Details: 206. Reverse Linked List
 *https://leetcode.com/problems/reverse-linked-list/
   */
public class Q109_ReverseOfLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head, next = head;
        while (next != null) {
            next = next.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}
