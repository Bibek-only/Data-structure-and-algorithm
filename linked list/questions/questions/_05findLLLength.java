public class _05findLLLength {

    public static class LinkedList{
        public static class Node{
            int data;
            Node next;

            public Node(int data){
                this.data = data;
                this.next = null;
            }
        }

        //declare head and tail
        public static Node head;
        public static Node tail;

        //function to add data in linkedlist at last
        public void addAtLast(int data){
            //creaate a new node
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                tail = newNode;
                return;
            }

            //at at last
            tail.next = newNode;
            tail = newNode;
        }

        //function to print thelinked list
        public void  printLinkedList(){
            if(head == null){
                System.out.println("null");
                return;
            }

            Node currentNode = head;
            while(currentNode != null){
                System.out.print(currentNode.data+" -> ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }

        //function to find the lengeth of the linked list
        public int findLinkedListLength(){
            if(head == null){
                
                return 0;
            }

            Node currentNode = head;
            int count = 1;
            while(currentNode.next != null){
                count++;
                currentNode = currentNode.next;
            }

            return count;

        }
    }
    
    public static void main(String[] args) {
        //create the linked list object
        LinkedList ll = new LinkedList();

        
        ll.addAtLast(1);
        ll.addAtLast(2);
        ll.addAtLast(3);
        ll.addAtLast(4);
        ll.addAtLast(5);

        int len = ll.findLinkedListLength();
        ll.printLinkedList();
        System.out.println("the length of the linked list = "+ len);
    }
}