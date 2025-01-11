public class _16detectCycleInLinkedList {

    static public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;

    //detect the cycle in thelinked list using the floyeds cycle detection algorithem

    public static boolean detectCycle(){
        if(head == tail || head == null){
            return false;
        }

        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }

        }

        return false;
    }
    public static void main(String[] args) {
        
        //create the linked llst
        head =new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = head; //makeing it to point to head and create a cycle

        System.out.println(detectCycle());

        
    }
}