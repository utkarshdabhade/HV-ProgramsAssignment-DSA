import java.util.HashSet;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void removeDuplicates() {
        if (head == null) {
            return;
        }

        HashSet<Integer> uniqueElements = new HashSet<>();
        Node current = head;
        Node prev = null;

        while (current != null) {
            if (uniqueElements.contains(current.data)) {
                prev.next = current.next;
            } else {
                uniqueElements.add(current.data);
                prev = current;
            }
            current = current.next;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class REMOVEDUPLICATE {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(2);
        list.insert(5);
        list.insert(12);
        list.insert(2);
        list.insert(3);
        list.insert(5);
        list.insert(1);
        list.insert(2);
        list.insert(5);
        list.insert(5);

        list.removeDuplicates();
        list.display();
    }
}
