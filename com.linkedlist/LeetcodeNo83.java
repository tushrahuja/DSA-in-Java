

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class LeetcodeNo83 {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(1);
    head.next.next = new ListNode(2);
    head = deleteDuplicates(head);
    while(head != null){
        System.out.print(head.val + " -> ");
        head = head.next;
    }
    System.out.println("null");
  }
  static ListNode deleteDuplicates(ListNode node) {
        if(node == null){
            return node;
        }
        ListNode head = node;
        while(node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }
}
