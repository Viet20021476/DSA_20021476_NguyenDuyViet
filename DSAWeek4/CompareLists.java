public class CompareLists {
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode curr1 = head1;
        SinglyLinkedListNode curr2 = head2;

        while (curr1 != null && curr2 != null) {
            if (curr1.data != curr2.data) {
                return false;
            } else {
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
            if ((curr1 == null && curr2 != null) || (curr1 != null && curr2 == null)) {
                return false;
            }
        }
        return true;
    }
}
