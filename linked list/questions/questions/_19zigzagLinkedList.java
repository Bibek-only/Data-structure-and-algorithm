public class _19zigzagLinkedList {
    public static class LinkedList {
        class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node head = null;
        Node tail = null;

        // make the linked list to zig zag format
        void zigzag(){
            if(head == null || head.next == null || head.next.next ==null){
                return;
            }

            //step one devide the inked list in to two part
            Node mid = getMid();
            Node leftHead = mid.next;
            mid.next = null;

            //step two reverse the second half of thelinkedlist
            reverseSecondHalf(leftHead);

            //doing the alternate merging
            alternetMerge(head, tail);

        }

        void alternetMerge(Node leftHead,Node rightHead){

            Node nextOfLeftHead; //track the left part of the linked list
            Node nextOfrightHead; //track the right part of the linked list

            while(leftHead != null && rightHead != null){

                nextOfLeftHead = leftHead.next; 
                leftHead.next = rightHead;

                nextOfrightHead = rightHead.next;
                rightHead.next = nextOfLeftHead;

                leftHead=nextOfLeftHead;
                rightHead=nextOfrightHead;
            }
        }

        void reverseSecondHalf(Node currentNode){

            Node previouseNode = null;
            Node nextNode;

            while(currentNode != null){
                nextNode = currentNode.next;
                currentNode.next = previouseNode;
                previouseNode = currentNode;
                currentNode = nextNode;
            }
            
        }
        Node getMid() {
            if (head == null || head.next == null) {
                return head;
            }

            Node fast = head.next;
            Node slow = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

            }
            return slow;
        }

        void printLL() {
            if (head == null) {
                return;
            }

            Node currentNode = head;
            while (currentNode != null) {

                System.out.print(currentNode.data + "-> ");
                currentNode = currentNode.next;
            }
            System.out.println();

        }

        void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.printLL();
        ll.zigzag();
        ll.printLL();
       
    }
}
