import org.w3c.dom.ls.LSOutput;

public class DeleteNode {
    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        SinglyLinkedListNode curr = llist;
        int count = 0;
        if (position == 0) {
            llist = llist.next;
            return llist;
        }

        while (curr.next != null) {
            if (count == position - 1) {
                break;
            }
            curr = curr.next;
            count++;
        }
        if (curr.next.next == null) {
            curr.next = null;
        } else {
            curr.next = curr.next.next;
        }
        return llist;
    }


}
