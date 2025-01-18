public class _20DoubleLinkedList {
    public static class DoubleLL{
        class Node{
            int data;
            Node next;
            Node prev;

            public Node(int data){
                this.data = data;
                this.next = null;
                this.prev = null;
            }
        }


        Node head = null;
        Node tail = null;

        // add first operation

        void addFirst(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }

            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        //add last operaton
        void addLast(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        //remove first
        void removeFirst(){
            if(head == null){
                return;
            }
            if(head.next == null){
                head = tail = null;
                return;
            }
            Node temp = head;
            head = head.next;
            head.prev = null;
            temp.next = null;
        }

        //remove last
        void removeLast(){
            if(head == null){
                return;
            }
            if(head.next == null){
                head = tail = null;
                return;
            }

            Node temp = tail;
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }

        void PrintDoubleLL(){
            if(head == null){
                return;
            }
            Node temp = head;
            System.out.print("null <-> ");
            while(temp != null){
                System.out.print(temp.data+" <-> ");
                temp=temp.next;
            }
            System.out.print("null");
            System.out.println();
        }



    }
    
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.addLast(6);
        dll.addLast(7);
        dll.addLast(8);
        dll.addLast(9);
        dll.addLast(10);

        dll.PrintDoubleLL();
        
        dll.removeFirst();
        dll.removeLast();

        dll.PrintDoubleLL();
    }
}
