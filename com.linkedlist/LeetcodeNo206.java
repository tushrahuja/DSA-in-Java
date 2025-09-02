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

public class LeetcodeNo206 {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    ListNode reversed = reverseList(head);
    while (reversed != null) {
      System.out.print(reversed.val + " ");
      reversed = reversed.next;
    }
  }

  static ListNode reverseList(ListNode head) {
    if (head == null) {
      return head;
    }
    ListNode prev = null;
    ListNode pres = head;
    ListNode nex = pres.next;
    while (pres != null) {
      pres.next = prev;
      prev = pres;
      pres = nex;
      if (nex != null) {
        nex = nex.next;
      }
    }
    return prev;
  }
}
