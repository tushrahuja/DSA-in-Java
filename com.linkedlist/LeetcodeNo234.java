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

public class LeetcodeNo234 {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(1);
    System.out.println(isPalindrome(head));
  }

  static boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null) {
      return true;
    }

    ListNode slow = head;
    ListNode fast = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    ListNode newHead = reverse(slow.next);

    ListNode first = head;
    ListNode second = newHead;
    while (second != null) {
      if (first.val != second.val) {
        reverse(newHead);
        return false;
      }
      first = first.next;
      second = second.next;
    }
    slow.next = reverse(newHead);
    return true;
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
}