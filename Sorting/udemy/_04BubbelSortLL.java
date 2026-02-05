class LinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    int length = 0;
    Node head;

    // append linked list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
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

    public void printll() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-> ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    // bubbel sort
    
        public void bubbelSort(){
    if(length < 2){
        return;
    }
    
    for(int i = 0; i < length - 1; i++){
        Node currNode = head;
        for(int j = 0; j < length - i - 1; j++){
            if(currNode.data > currNode.next.data){
                int temp = currNode.data;
                currNode.data = currNode.next.data;
                currNode.next.data = temp;
            }
            currNode = currNode.next;
        }
    }
}
    

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(3);
        ll.append(2);
        ll.append(1);
        ll.printll();
        ll.bubbelSort();
        ll.printll();
    }
}
