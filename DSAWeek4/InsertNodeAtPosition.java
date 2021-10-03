public class InsertNodeAtPosition {
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode curr = llist;
        int count = 0;

        while (true) {
            curr = curr.next;
            count++;
            if (count == position - 1) {
                break;
            }
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return llist;
    }
}
