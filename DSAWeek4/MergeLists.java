public class MergeLists {
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        SinglyLinkedListNode curr1 = head1;
        SinglyLinkedListNode curr2 = head2;

        if (curr1.data >= curr2.data) {
            curr2.next = mergeLists(curr1, curr2.next);
            return curr2;
        } else {
            curr1.next = mergeLists(curr1.next, curr2);
            return curr1;
        }
    }
}
