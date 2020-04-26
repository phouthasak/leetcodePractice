public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode node = new ListNode(0);
        ListNode head = node;

        while(l1 != null && l2 != null) {
            ListNode temp;

            if (l1.val > l2.val) {
                temp = new ListNode(l2.val);
                node.next = temp;
                node = node.next;
                l2 = l2.next;
            } else {
                temp = new ListNode(l1.val);
                node.next = temp;
                node = node.next;
                l1 = l1.next;
            }
        }
        node.next = (l1 != null) ? l1 : l2;
        return head.next;
    }
}
