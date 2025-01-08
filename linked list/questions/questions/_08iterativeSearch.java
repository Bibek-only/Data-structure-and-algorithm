public class _08iterativeSearch {
    public static class LinkedList{
        public class Node{
            int data;
            Node next;

            public Node(int data){
                this.data = data;
                this.next = null;
            }
        }

        //declare the head and tial
        public static Node head;
        public static Node tail;


        // functio for iterative search for an key
        public int searchKey(int key){ //it return first occurance of the key
            if(head == null){
                System.out.println("no linked list is present");
                return -1;
            }

            Node currentNode = head;
            int index = 0;

            while(currentNode != null){
                if(currentNode.data == key){
                    return index;
                }
                currentNode = currentNode.next;
                index++;
            }

            return -1;
        }

        //functio to add element in the last
        public void addLast(int data){
            Node newNode = new Node(data);
            if(head == null){

                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        //print the linkedlist
        public void printLinkedList(){
            if(head == null){
                System.out.println("no linked list exist");
                return;
            }

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
        ll.addLast(4);
        ll.addLast(5);
        ll.printLinkedList();

        int key = 3;
        int index = ll.searchKey(key);
        
        if(index >= 0 ){
            System.out.println("the key "+key+" is present in the "+index+" the index");
        }

    }
}
