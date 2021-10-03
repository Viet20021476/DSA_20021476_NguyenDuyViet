public class GetNodeValue {
    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
        SinglyLinkedListNode curr = llist;
        int count = 0;
        int count1 = 0;

        while (curr != null) {
            curr = curr.next;
            count++;
        }
        curr = llist;

        while (curr != null) {
            if (count1 == count - positionFromTail - 1) {
                return curr.data;
            }
            curr = curr.next;
            count1++;

        }
        return 0;
    }
}
