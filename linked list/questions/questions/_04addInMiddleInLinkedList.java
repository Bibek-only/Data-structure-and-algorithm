public class _04addInMiddleInLinkedList {
    public static class LinkedList {
        public static class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static Node head;
        public static Node tail;

        public void addFirst(int data){ //add the element infirst
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



        // add in middle method
        public void addInMiddle(int data, int placeIndex){
            if(placeIndex < 0 ){ //if place index is negative
                System.out.println("invalid index to place the node");
                return;
            }

            //base condition for if ther eis not element in linked list
            if(placeIndex == 0){
                addFirst(data);
                return;
            }

            Node prevNode = head; //step1-> create a new node

            int count = 0; // to track the previous node

            while(count < placeIndex-1){ //find the previous node 
                count ++;
                prevNode = prevNode.next;
                
                if(prevNode == null ){
                    break;
                }
            }

            if(prevNode == null){ //checj the previos node
                System.out.println("invalid position");
                return;
            }

            Node newNode = new Node(data);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
            
        }
          

        // print the linked list
        public void printLinkedList() {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data + " -> ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        //add some element in the linked list
        ll.addFirst(9);
        ll.addFirst(8);
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);


        
        
        ll.addInMiddle(5,0);
       
        ll.printLinkedList();
    }
}
