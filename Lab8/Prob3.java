import java.util.*;

class Node {
    int val;
    Node prev;
    Node next;

    public Node(int x) {
        this.prev = null;
        this.next = null;
        this.val = x;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;
    int length;

    public DoublyLinkedList() {
        head = tail = null;
        this.length = 0;
    }

    public void append(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            // means this is an empty dll.
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
        length = length + 1;
    }

    public void insert(int x, int index) {
        int curr = 0;
        Node current = head;
        Node previous = null;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (index >= length) {
            System.out.println("Index is out of bounds.");
            return;
        }
        while (curr < index) {
            curr++;
            current = current.next;
        }
        previous = current.prev;
        Node newNode = new Node(x);
        previous.next = newNode;
        newNode.prev = previous;
        newNode.next = current;
        current.prev = newNode;
        length = length + 1;
    }

    public void printList() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println("");
    }
}

class DemoClass {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.append(26);
        dll.append(40);
        dll.insert(30, 1);
        dll.printList();
    }
}