public class _13removeNthNodeFromBack {

    public static class LinkedList{
        class Node{
            int data;
            Node next;

            public Node(int data){
                this.data = data;
                this.next = null;
            }
        }

        Node head = null;
        Node tail = null;

        //remove nth node form back
        void removeNthFromback(int NthNode){
            //node to be delted find fomula = length - posiionof back
            int indexFront = findLength() - NthNode;

            if(head == null || indexFront < 0){
                System.out.println("invalid index,node to remove");
                return;
            }

            //check if we need to delete the head
            if(indexFront == 0){
                Node temp = head;
                head = head.next;
                temp.next = null;
                return;
            }

            Node prev = head;
            int count = 0;
            while(count <indexFront-1){
                prev = prev.next;
                if(prev == null || prev == tail){
                    System.out.println("invalid index to remove");
                    return;
                }
                count++;
            }

            prev.next = prev.next.next;

            
            
        }

        //find the size of the linked list
        int findLength(){
            if(head == null){
                return 0;
            }
            int count = 0;
            Node currentNode = head;
            while(currentNode != null){
                count++;
                currentNode = currentNode.next;
            }
            return count;
        }

        void addLast(int data){  
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        void printLL(){
            if(head == null){
                return;
            }
            Node currentNode = head;
            while(currentNode != null){
                System.out.print(currentNode.data+"-> ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        System.out.println("the node indexing starting form 0.....");
        System.out.println("the node indexing starting form backword 1.....");

        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.printLL();
        ll.removeNthFromback(6);
        ll.printLL();
    }
}
