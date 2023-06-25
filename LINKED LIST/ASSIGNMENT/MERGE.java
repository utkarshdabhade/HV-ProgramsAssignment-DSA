import java.util.*;

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

    public void merge(LinkedList list1, LinkedList list2) {
        Node current1 = list1.head;
        Node current2 = list2.head;
        LinkedList mergedList = new LinkedList();

        while (current1 != null && current2 != null) {
            if (current1.data < current2.data) {
                mergedList.insert(current1.data);
                current1 = current1.next;
            } else {
                mergedList.insert(current2.data);
                current2 = current2.next;
            }
        }

        while (current1 != null) {
            mergedList.insert(current1.data);
            current1 = current1.next;
        }

        while (current2 != null) {
            mergedList.insert(current2.data);
            current2 = current2.next;
        }

        head = mergedList.head;
    }

    public void sort() {
        if (head == null || head.next == null) {
            return;
        }

        Node current = head;
        while (current.next != null) {
            Node innerCurrent = current.next;
            while (innerCurrent != null) {
                if (current.data > innerCurrent.data) {
                    int temp = current.data;
                    current.data = innerCurrent.data;
                    innerCurrent.data = temp;
                }
                innerCurrent = innerCurrent.next;
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

public class MERGE {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insert(25);
        list1.insert(35);
        list1.insert(12);
        list1.insert(4);
        list1.insert(36);
        list1.insert(48);

        LinkedList list2 = new LinkedList();
        list2.insert(8);
        list2.insert(32);
        list2.insert(22);
        list2.insert(45);
        list2.insert(63);
        list2.insert(49);

        LinkedList mergedList = new LinkedList();
        mergedList.merge(list1, list2);
        mergedList.sort();
        mergedList.display();
    }
}
