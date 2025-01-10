public class _10reverseLinkedList {
    public static class LinkedList{
        public class Node{
            int data;
            Node next;
            public Node(int data){
                this.data = data; 
                this. next = null;
            }
        }

        public Node head;
        public Node tail;

        //reverse the linkedList
        public void reverseLinkedLIst(){
            if(head == null || head == tail){
                return;
            }

            //make the first node to tail
            tail = head;
            
            Node currNode = head; //inirialize the current node
            Node prevNode = null; //initialize the previous node with null
            Node nextNode;
            while(currNode != null){
                nextNode = currNode.next;
                currNode.next= prevNode;
                prevNode = currNode;
                currNode = nextNode;
            }

            head = prevNode; //make the last node to head which is previos

        }

        //add data at last
        public void addAtLat(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
            }

            tail.next = newNode;
            tail = newNode;
        }

        //print the linkedList
        public void printLL(){
            if(head == null){
                System.out.println("No linked list is present");
                return;
            }

            Node currentNode = head;
            while(currentNode != null){
                System.out.print(currentNode.data+"->");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtLat(1);
        ll.addAtLat(2);
        ll.addAtLat(3);
        ll.addAtLat(4);
        ll.addAtLat(5);

        ll.printLL();
        ll.reverseLinkedLIst();
        ll.printLL();
    }
}
