class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head;

    void removeDuplicates() {
        Node current = head;

        while (current != null) {
            Node runner = current;

            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }

            current = current.next;
        }
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(2);
        list.head.next = new Node(5);
        list.head.next.next = new Node(12);
        list.head.next.next.next = new Node(2);
        list.head.next.next.next.next = new Node(3);
        list.head.next.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next.next = new Node(1);
        list.head.next.next.next.next.next.next.next = new Node(2);
        list.head.next.next.next.next.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next.next.next.next.next = new Node(5);

        System.out.println("Linked List before removing duplicates:");
        list.printList();

        list.removeDuplicates();

        System.out.println("Linked List after removing duplicates:");
        list.printList();
    }
}
