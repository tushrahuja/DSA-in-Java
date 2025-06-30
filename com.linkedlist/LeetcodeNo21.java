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

public class LeetcodeNo21 {
  public static void main(String[] args) {
    ListNode list1 = new ListNode(1);
    list1.next = new ListNode(2);
    list1.next.next = new ListNode(4);

    ListNode list2 = new ListNode(1);
    list2.next = new ListNode(3);
    list2.next.next = new ListNode(4);

    ListNode mergedList = mergeTwoLists(list1, list2);
    while (mergedList != null) {
      System.out.print(mergedList.val + " -> ");
      mergedList = mergedList.next;
    }
    System.out.println("null");
  }

  static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummyHead = new ListNode(); // Dummy head for the merged list
    ListNode tail = dummyHead; // Pointer to the last node in the merged list
    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) { // Compare values of the two lists
        tail.next = list1; // Attach list1 node to the merged list
        list1 = list1.next; // Move to the next node in list1
      } else {
        tail.next = list2; // Attach list2 node to the merged list
        list2 = list2.next; // Move to the next node in list2
      }
      tail = tail.next;
    }
    tail.next = (list1 != null) ? list1 : list2; // Attach the remaining nodes of list1 or list2, if any
    return dummyHead.next; // Return the next node of dummy head, which is the head of the merged list
  }
}
