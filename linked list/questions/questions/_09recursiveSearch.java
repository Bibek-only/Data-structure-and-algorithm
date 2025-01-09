public class _09recursiveSearch {
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
        public  Node head;
        public  Node tail;


        // functio for iterative search for an key
        public int searchKey(int key, int currnetIndex, Node currnetNode){ //it return first occurance of the key
            if(head == null || currnetNode == null){
                
                return -1;
            }

            if(currnetNode.data == key){
                return currnetIndex;
            }

           return searchKey(key, currnetIndex+1, currnetNode.next);
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
        int index = ll.searchKey(key, 0, ll.head);
        System.out.println("the key is we looking is = "+ key);
        System.out.println(index);

    }
}
