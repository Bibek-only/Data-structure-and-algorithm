package DDL;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int length = 0;

    // function to print the linkedList
    public void printDLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    // function to append a node
    public boolean append(int data) { // time complexity O(1)
        Node newNode = new Node(data);
        if (length == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
        return true;
    }

    // function to prepend a node
    public boolean prepend(int data) { // time complexity O(1)
        Node newNode = new Node(data);
        if (length == 0) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
        return true;
    }

    // function to remove lastNode and return the Node
    public Node removeLastNode() {
        if (length == 0) {
            return null;
        }
        Node temp = tail;
        if (length == 1) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;

    }
}
