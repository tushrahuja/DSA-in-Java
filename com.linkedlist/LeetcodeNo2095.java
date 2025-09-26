class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

public class LeetcodeNo2095 {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(3);
    head.next.next = new ListNode(4);
    head.next.next.next = new ListNode(7);
    head.next.next.next.next = new ListNode(1);
    head.next.next.next.next.next = new ListNode(2);
    head.next.next.next.next.next.next = new ListNode(6);

    ListNode result = deleteMiddle(head);
    while (result != null) {
      System.out.print(result.val + " -> ");
      result = result.next;
    }
    System.out.print("null");
  }

  static ListNode deleteMiddle(ListNode head) {
    if (head == null || head.next == null) {
      return null;
    }
    ListNode slow = head;
    ListNode fast = head;
    ListNode prevSlow = null;
    while (fast != null && fast.next != null) {
      prevSlow = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    prevSlow.next = slow.next;
    return head;
  }
}