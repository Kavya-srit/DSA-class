public class ReverseLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode reverseLinkedList(ListNode head) {
        ListNode prevNode = null;
        ListNode currNode = head;

        while (currNode != null) {
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        return prevNode;
    }

    public static void printLinkedList(ListNode head) {
        ListNode currNode = head;

        while (currNode != null) {
            System.out.print(currNode.val + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        ListNode reversedHead = reverseLinkedList(head);

        System.out.println("Reversed Linked List:");
        printLinkedList(reversedHead);
    }
}
