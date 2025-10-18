class LinkedList {
    private Node head;
    private Node tail;
    private int length = 0;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Append at last
    public Node appendLast(int data) {
        Node newNode = new Node(data);
        if (length == 0) {
            head = tail = newNode;

        } else {
            tail.next = newNode;
            tail = newNode;
            
        }
        length++;
        return newNode;
    }

    // print the linked list
    public void printLinkedList(Node cuNode) {
        Node currNode = cuNode;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println();
    }
    //function to remove the first 
    public Node removeFirst(){
        if(head ==  null){
            return null;
        }
        else if(head.next == null){
            head = tail = null;
            return null;
        }else{

            Node removedNode = head;
            head = head.next;
            removedNode.next = null;
            length--;
            return removedNode;
        }
    }

    public static void main(String[] args) {
        // creation of the linked list
        LinkedList ll = new LinkedList();
        // ll.appendLast(1);
        // ll.appendLast(2);
        // ll.appendLast(3);
        // ll.appendLast(4);
        // ll.appendLast(5);
        Node firstRemoveNode = ll.removeFirst();
        if(firstRemoveNode != null){
            System.out.println(firstRemoveNode.data);
        }
    }
}