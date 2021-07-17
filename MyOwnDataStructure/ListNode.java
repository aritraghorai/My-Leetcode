package MyOwnDataStructure;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int data, ListNode next) {
        this.val = data;
        this.next = next;
    }

    public ListNode(int data) {
        this.val = data;
        next = null;
    }

    public ListNode() {
        val = 0;
        next = null;
    }
}
