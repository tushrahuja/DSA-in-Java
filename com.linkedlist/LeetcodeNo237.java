class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }
}

public class LeetcodeNo237 {
  public static void main(String[] args) {
    ListNode head = new ListNode(4);
    head.next = new ListNode(5);
    head.next.next = new ListNode(1);
    head.next.next.next = new ListNode(9);

    deleteNode(head.next);
    while (head != null) {
      System.out.print(head.val + " -> ");
      head = head.next;
    }
    System.out.println("null");
  }
  static void deleteNode(ListNode node) {
        ListNode prev = null;
        while(node != null && node.next != null){
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }
        prev.next = null;
    }
}