package MyOwnDataStructure;

/*
 !Name: Aritra Ghorai
 !ate:04/07/2021
 ?Program etails: LinkedList Implementation
   */

public class MyLinkedList {

    private int Size = 0;
    public ListNode head = null;
    private ListNode tail = null;

    // *Inset At Frist In LinkedList
    public void AddFrist(int data) {
        ListNode insertNode = new ListNode(data, null);
        if (this.head == null) {
            this.head = this.tail = insertNode;
        } else {
            insertNode.next = head;
            head = insertNode;
        }
        Size++;
    }

    // *Add End Of the LinkedList
    public void addLast(int val) {
        if (head == null) {
            AddFrist(val);
        } else {
            ListNode iNode = new ListNode(val, null);
            this.tail.next = iNode;
            this.tail = iNode;
            Size++;
        }
    }

    // *Get Spectfic Node
    private ListNode getNode(int index) throws Exception {
        if (index == 0) {
            return this.head;
        }
        if (index > Size || index < 0) {
            throw new Exception("Index oes Not Exist");
        } else {
            ListNode temp = this.head;
            index--;
            while (index != 0) {
                temp = temp.next;
                index--;
            }
            return temp;
        }
    }

    // *Add Eliment In The Specific Index
    public void add(int data, int index) throws Exception {
        if (this.head == null) {
            AddFrist(data);
            return;
        }
        if (index == Size) {
            addLast(data);
            return;
        }
        ListNode nn = getNode(index - 1);
        ListNode nnNext = nn.next;
        ListNode insertNode = new ListNode(data, nnNext);
        nn.next = insertNode;
        Size++;
    }

    // *Delete Frist In Linked
    public int deleteFrist() throws Exception {
        if (this.head == null) {
            throw new Exception("LinkedList is Empty");
        }
        if (this.Size == 1) {
            ListNode dNode = this.head;
            this.head = head.next;
            this.tail = tail.next;
            Size--;
            return dNode.val;
        } else {
            ListNode dNode = this.head;
            this.head = head.next;
            Size--;
            return dNode.val;
        }
    }

    // *Delete at any Index
    public int delete(int index) throws Exception {
        if (this.head == null) {
            throw new Exception("LinkedList is Empty");
        }
        if (index == 1) {
            return deleteFrist();
        } else if (index == this.Size) {
            ListNode n = getNode(index - 1);
            ListNode n2 = n.next;
            n.next = null;
            this.tail = n;
            Size--;
            return n2.val;
        } else {
            ListNode n = getNode(index - 1);
            ListNode n2 = n.next;
            n.next = n2.next;
            Size--;
            return n2.val;
        }

    }

    // *Delete Last Of the LinkedList
    public int deleteLast() throws Exception {
        return delete(Size);
    }

    // *Disply Element in LinkedList
    public void Display() throws Exception {
        if (this.head == null) {
            throw new Exception("Your LinkedList Is Empty,You can't Print");
        } else {
            ListNode temp = head;

            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public int Size() {
        return this.Size;
    }

}
