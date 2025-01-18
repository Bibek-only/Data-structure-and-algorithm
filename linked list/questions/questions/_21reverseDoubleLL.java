public class _21reverseDoubleLL {
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

        void reverseLL(){
            if(head == null || head.next == null){
                return;
            }
            Node prevNode = null;
            Node cuurentNode = head;
            Node nextNode;
            tail = head;

            while(cuurentNode != null){
                nextNode = cuurentNode.next;
                cuurentNode.next = prevNode;
                cuurentNode.prev = nextNode;
                prevNode = cuurentNode;
                cuurentNode = nextNode;
            }
            head = prevNode;
        }

        void printLL(){
            Node temp = head;
            System.out.print("null <-> ");
            while(temp != null){
                System.out.print(temp.data+" <-> ");
                temp = temp.next;
            }
            System.out.print("null");
            System.out.println();
        }
    }
    public static void main(String[] args) {

        DoubleLL dll = new DoubleLL();
        dll.addLast(1); 
        dll.addLast(2); 
        dll.addLast(3); 
        dll.addLast(4); 
        dll.addLast(5);

        dll.printLL();
        dll.reverseLL();
        dll.printLL();
        
    }
}
