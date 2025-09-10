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

public class LeetcodeNo2 {
  public static void main(String[] args) {
    ListNode head1 = new ListNode(2);
    head1.next = new ListNode(4);
    head1.next.next = new ListNode(3);

    ListNode head2 = new ListNode(5);
    head2.next = new ListNode(6);
    head2.next.next = new ListNode(4);

    ListNode result = addTwoNumbers(head1, head2);
    while (result != null) {
      System.out.print(result.val + " -> ");
      result = result.next;
    }
    System.out.print("null");
  }

  static ListNode addTwoNumbers(ListNode head1, ListNode head2) {
    ListNode dummyNode = new ListNode(-1);
    ListNode curr = dummyNode;
    ListNode l1 = head1;
    ListNode l2 = head2;
    int carry = 0;
    while (l1 != null || l2 != null) {
      int sum = carry;
      if (l1 != null)
        sum += l1.val;
      if (l2 != null)
        sum += l2.val;
      ListNode newNode = new ListNode(sum % 10);
      carry = sum / 10;
      curr.next = newNode;
      curr = curr.next;
      if (l1 != null)
        l1 = l1.next;
      if (l2 != null)
        l2 = l2.next;
    }
    if (carry > 0) {
      ListNode newNode = new ListNode(carry);
      curr.next = newNode;
    }
    return dummyNode.next;
  }
}