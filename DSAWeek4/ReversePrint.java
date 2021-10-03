public class ReversePrint {
    public static void reversePrint(SinglyLinkedListNode llist) {
        if (llist.next == null) {
            System.out.println(llist.data);
            return;
        } else {
            reversePrint(llist.next);
            System.out.println(llist.data);
        }
    }
}
