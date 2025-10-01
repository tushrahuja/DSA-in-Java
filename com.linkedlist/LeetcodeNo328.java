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

public class LeetcodeNo328 {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    ListNode result = oddEvenList(head);
    while (result != null) {
      System.out.print(result.val + " -> ");
      result = result.next;
    }
    System.out.println("null");
  }

  static ListNode oddEvenList(ListNode head) {
    if (head == null) {
      return head;
    }
    ListNode odd = head;
    ListNode even = head.next;
    ListNode evenStart = head.next;
    while (even != null && even.next != null) {
      odd.next = even.next;
      even.next = even.next.next;
      odd = odd.next;
      even = even.next;
    }
    odd.next = evenStart;
    return head;
  }
}