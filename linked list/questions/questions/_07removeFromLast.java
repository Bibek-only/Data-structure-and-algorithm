public class _07removeFromLast {
    public static class LinkedList{
        public  class Node{
            int data;
            Node next;

            public Node(int data){
                this.data = data;
                this.next = null;
            }
        }

        public static Node head;
        public static Node tail;

        //functio to remov the last element from the linked list
        public void removeNodeFromLast(){
            if(head == null){
                System.out.println("no linked list is exist");
                return;
            }

            if(head == tail){
                head = tail = null;
                return;
            }

            //find the previos node of the tail
            Node prevOfTail = head;
            while(prevOfTail.next != tail){
                prevOfTail = prevOfTail.next;
            }


            prevOfTail.next = null;
            tail = prevOfTail;
            

            
        }

        //function to add element in the last of the linked lsit
        public void addLast(int data){
            Node newNode = new Node(data);
            if( head == null){
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
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
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printLinkedList();
        
        //remove the last of the linked list
        ll.removeNodeFromLast();
        ll.printLinkedList();
    }
}
