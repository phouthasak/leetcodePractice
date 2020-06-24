public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while(head != null) {
            // store the next value
            ListNode next = head.next;

            // replace the next value with the prev value
            head.next = prev;

            // prev value is the current value
            prev = head;


            head = next;
        }

        return prev;
    }
}
