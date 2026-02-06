class LinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private int length = 0;

    // append
    public void append(int data) {
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
        length++;
    }

    // print linked list
    public void printLL() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println();
    }

    // merge two sorted linked list
    public void merge(LinkedList l2){
        Node dummy = new Node(0); // crate a comple new list which is merged
        Node curr1 = head; // to track the list 1
        Node curr2 = l2.head; // to track the second list
        Node curr = dummy; // to track the new list
        
        while (curr1 != null && curr2 != null) {
            
            if(curr1.data < curr2.data){
                curr.next = curr1;
                curr1 = curr1.next;
                curr = curr.next;
            }else{
                curr.next = curr2;
                curr2 = curr2.next;
                curr = curr.next;
            }
        }

        while(curr1 != null){
            curr.next = curr1;
                curr1 = curr1.next;
                curr = curr.next;
                System.out.println("loop2");
        }
        while(curr2 != null){
            curr.next = curr2;
                curr2 = curr2.next;
                curr = curr.next;
                System.out.println("loop3");
        }

        head = dummy.next;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        LinkedList ll2 = new LinkedList();
        
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll2.append(4);
        ll2.append(5);
        ll2.append(6);
        ll.printLL();
        ll.merge(ll2);
        ll.printLL();


    }
}