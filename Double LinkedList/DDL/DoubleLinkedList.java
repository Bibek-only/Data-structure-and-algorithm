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
    public Node removeLast() {
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

    public Node removeFirst() { // function to do the removefirst from a double linked list
        if (length == 0) {
            return null;
        }
        Node removedNode = head;
        if (length == 1) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
            removedNode.next = null;
        }
        length--;
        return removedNode;
    }

    public Node get(int index) { // this function take an index of a node and return the corresponding node
                                 
        if (index < 0 || index >= length) {
            return null;
        } else {
            Node targetNode = head;
            for (int i = 0; i < index; i++) {
                targetNode = targetNode.next;
            }
            return targetNode;
        }
    }

    public boolean set(int index, int data) { // this function get a value and index of node and update the value of the
                                              // given node
        Node toUpdateNode = get(index);
        if (toUpdateNode == null) {
            return false;
        } else {
            toUpdateNode.data = data;
            return true;
        }
    }

    public boolean insert(int index, int data) {
        if (index < 0 || index > length) {
            return false;
        } else if (index == 0) {
            prepend(data);
            return true;
        } else if (index == length) {
            append(data);
            return true;
        } else {
            Node newNode = new Node(data);
            Node before = get(index - 1);
            Node after = before.next;
            before.next = newNode;
            after.prev = newNode;
            newNode.next = after;
            newNode.prev = before;
            length++;
            return true;
        }
    }

    public Node remove(int index) { // this funciton take a index of a node and remove the node from the list
        if (index < 0 || index >= length) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == length - 1) {
            return removeLast();
        } else {
            Node removedNode = get(index);
            Node before = removedNode.prev;
            Node after = removedNode.next;
            before.next = after;
            after.prev = before;
            removedNode.next = removedNode.prev = null;
            length--;
            return removedNode;
        }
    }
}
