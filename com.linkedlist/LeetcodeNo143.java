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

public class LeetcodeNo143 {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    reorderList(head);
    while (head != null) {
      System.out.print(head.val + " -> ");
      head = head.next;
    }
    System.out.println("null");
  }

  static void reorderList(ListNode head) {
    ListNode mid = middle(head);
    ListNode newHead = reverse(mid);

    ListNode first = head;
    ListNode second = newHead;
    while (first != null && second != null) {
      ListNode temp = first.next;
      first.next = second;
      first = temp;
      temp = second.next;
      second.next = first;
      second = temp;
    }
  }

  static ListNode reverse(ListNode head) {
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

  static ListNode middle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
}
