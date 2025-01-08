public class _03addLastInLinkedList {
    public static class LinkedList{
        public static class Node{
            int data;
            Node next;

            public Node(int data){
                this.data = data;
                this.next = null;
            }
        }

        public static Node head;
        public static Node tail;

        //add last method
        public void addLast(int data){
            Node newNode = new Node(data);
            if(head == null ){
                head = newNode;
                tail = newNode;
            }

            //make point the tail to new node
            tail.next = newNode;

            //make the new node to tail
            tail = newNode;
        }

        //print the linked list
        public void printLinkedList(){
            Node currentNode = head;
            while(currentNode != null){
                System.out.print(currentNode.data+" -> ");
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

        //print thelinkedlist
        ll.printLinkedList();
    }
}
