import MyOwnDataStructure.ListNode;

/*
 !Name: Aritra Ghorai
 !Date:22/08/2021
 ?Program Details: 234. Palindrome Linked List
 *https://leetcode.com/problems/palindrome-linked-list/
   */
public class Q108_PalindromeLinked_List {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = reverse(slow.next);
        fast = head;
        slow = slow.next;
        while (slow != null) {
            if (slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode current = head;
        ListNode next = head;
        while (next != null) {
            next = next.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }
}
