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

public class LeetcodeNo61 {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    int k = 2;
    ListNode result = rotateRight(head, k);
    while (result != null) {
      System.out.print(result.val + " -> ");
      result = result.next;
    }
    System.out.print("null");
  }

  static ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null || k == 0)
      return head;

    int length = 1;
    ListNode last = head;

    while (last.next != null) {
      length++;
      last = last.next;
    }

    k = k % length;
    if (k == 0)
      return head;

    last.next = head;

    int steps = length - k;
    ListNode newLast = head;
    for (int i = 1; i < steps; i++) {
      newLast = newLast.next;
    }
    head = newLast.next;
    newLast.next = null;

    return head;
  }
}
