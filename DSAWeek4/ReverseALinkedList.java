public class ReverseALinkedList {
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        SinglyLinkedListNode curr = llist;
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        llist = prev;
        return llist;
    }
}
