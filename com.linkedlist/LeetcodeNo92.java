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

public class LeetcodeNo92 {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head = reverseBetween(head, 2, 4);
    while (head != null) {
      System.out.print(head.val + " ");
      head = head.next;
    }
  }

  static ListNode reverseBetween(ListNode head, int left, int right) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode dummyHead = new ListNode(-1);
    dummyHead.next = head;
    ListNode prev = dummyHead;
    for (int i = 1; i < left; i++) {
      prev = prev.next;
    }
    ListNode current = prev.next;
    for (int i = 1; i <= right - left; i++) {
      ListNode temp = prev.next;
      prev.next = current.next;
      current.next = current.next.next;
      prev.next.next = temp;
    }
    return dummyHead.next;
  }
}
