public class _02addinfirst {
    //linked list class
    public static class LinkedList{
        public static class Node{
            int data;
            Node next;

            //constructor for initializeing the linked list
            public Node(int data){
                this.data = data;
                this.next = null;
            }
        }

        //define the head and tail
        public static Node head;
        public static Node tail;

        //add first method
        public void addFirst(int data){
            //base condition
            Node newNode = new Node(data); //step1-> create a new node
            if(head == null){
                head = newNode;
                tail = newNode;
                return;
            }

            newNode.next = head; //point the newnode to  the head
            head  = newNode; //make the new node to head
        }


        //print the linkedlist
        public void printLinkedList(){
            Node currentNode = head; //initialize the currentnode with head
            while(currentNode != null){
                System.out.print("data: "+currentNode.data+", nextReference: "+currentNode.next+" -> ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);

        ll.printLinkedList();

    }
}
