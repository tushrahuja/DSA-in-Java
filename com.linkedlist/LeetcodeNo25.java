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

public class LeetcodeNo25 {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    int k = 2;
    ListNode result = reverseKGroup(head, k);
    while (result != null) {
      System.out.print(result.val + " -> ");
      result = result.next;
    }
    System.out.print("null");
  }

  static ListNode reverseKGroup(ListNode head, int k) {
    ListNode curr = head;
    int count = 0;

    while (curr != null && count < k) {
      curr = curr.next;
      count++;
    }

    if (count == k) {
      ListNode prev = reverseKGroup(curr, k);
      while (count-- > 0) {
        ListNode temp = head.next;
        head.next = prev;
        prev = head;
        head = temp;
      }
      return prev;
    }
    return head;
  }
}
