public class _01createLinkedList{

    //linked list class
    public static class Node{
        int data;
        Node next;

        public Node(int data){ //constroctor to initialize theliked list
            this.data = data;
            this.next = null;
        }

    }
    //define linked list head and tail
    public static Node head;
    public static Node tail;
    public static void main(String[] args) {
        _01createLinkedList ll = new _01createLinkedList(); //create an linkedlist

        //create the linked list head
        ll.head = new Node(1); //create an linkedlist head which type is Node or it is an object of Node classs

        System.out.println(ll.head.data); // print the linked list's head data
    }
}