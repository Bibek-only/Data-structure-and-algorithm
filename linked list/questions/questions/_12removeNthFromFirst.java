public class _12removeNthFromFirst {

    public static class LinkedList {
        public class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public Node head = null;
        public Node tail = null;

        //remove the nth node from first
        public void removenthNodeFromFirst(int nodePosition){
            if(head == null || nodePosition < 0 ){
                System.out.println("in valid index to remove");
                return; 
            }

            if(nodePosition == 0 ){
                Node temp = head;
                head = head.next;
                temp.next = null;
            }

             Node prevNode = head;
             int count = 0;

             while(count < nodePosition-1){
                prevNode = prevNode.next;
                if(prevNode == null || prevNode == tail){
                    System.out.println("invalid index to remove");
                    return;
                }
                count ++;
             }

             
             
             prevNode.next = prevNode.next.next;

            }


        // add data at last
        public void addAtLat(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head =newNode;
                tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
            
        }

        // print the linkedList
        public void printLL() {
            if (head == null) {
                System.out.println("No linked list is present");
                return;
            }

            Node currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data + "->");
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

        ll.printLL(); //prin the linked list
        ll.removenthNodeFromFirst(5); //pass the index which to be removed
        ll.printLL(); // print the linked list after remove the element
        
        
        
    }
}
