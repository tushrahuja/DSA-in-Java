class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
  }
}

public class LeetcodeNo142 {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = head.next; // Create a cycle for testing
    ListNode cycleNode = detectCycle(head);
    if (cycleNode != null) {
      System.out.println("Cycle detected at node with value: " + cycleNode.val);
    } else {
      System.out.println("No cycle detected.");
    }
  }

  static ListNode detectCycle(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;
    ListNode temp = head;
    if (fast == null || fast.next == null) {
      return null;
    }
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (fast == slow) {
        break;
      }
    }
    if (slow != fast) {
      return null;
    }
    while (temp != slow) {
      temp = temp.next;
      slow = slow.next;
    }

    return slow;
  }
}
