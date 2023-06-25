

import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void add(int data) {
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
        if (list1.head == null) {
            head = list2.head;
            return;
        } else if (list2.head == null) {
            head = list1.head;
            return;
        }

        Node current1 = list1.head;
        Node current2 = list2.head;
        Node merged = null;
        Node tail = null;

        if (current1.data <= current2.data) {
            merged = current1;
            current1 = current1.next;
        } else {
            merged = current2;
            current2 = current2.next;
        }
        tail = merged;

        while (current1 != null && current2 != null) {
            if (current1.data <= current2.data) {
                tail.next = current1;
                current1 = current1.next;
            } else {
                tail.next = current2;
                current2 = current2.next;
            }
            tail = tail.next;
        }

        if (current1 != null) {
            tail.next = current1;
        } else {
            tail.next = current2;
        }

        head = merged;
    }

    public void sort() {
        if (head == null || head.next == null) {
            return;
        }

        Node current = head;
        while (current != null) {
            Node index = current.next;
            while (index != null) {
                if (current.data > index.data) {
                    int temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class AscendOrder {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.add(25);
        list1.add(35);
        list1.add(12);
        list1.add(4);
        list1.add(36);
        list1.add(48);

        LinkedList list2 = new LinkedList();
        list2.add(8);
        list2.add(32);
        list2.add(22);
        list2.add(45);
        list2.add(63);
        list2.add(49);

        LinkedList mergedList = new LinkedList();
        mergedList.merge(list1, list2);
        mergedList.sort();

        System.out.print("Merged and sorted linked list: ");
        mergedList.display();
    }
}
