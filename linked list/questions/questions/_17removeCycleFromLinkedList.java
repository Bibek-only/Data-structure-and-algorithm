public class _17removeCycleFromLinkedList {

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

    public static void detectAndRemoveCycle(){
        if(head == tail || head == null){ //base condition for one or no node in linked list
            return;
        }

        Node fast = head;
        Node slow = head;

        boolean isCycle = false;

        //step1 detect the loop

        while(fast != null && fast.next != null){
            slow = slow.next;

            if(fast.next.next == slow && slow == head){ //condition to check if the cycle point is form in the head,
                System.out.println("loop form in the head");
                fast.next.next = null; //make the fast.next.next to null which point to head and formed the cycle
                return ;                    
            }

            fast = fast.next.next;
            if(slow == fast){
                isCycle = true;
                break; //find that we hvae an loop in our linked list
            }

        }

        if(!isCycle){
            System.out.println("No loop in the  linked list is present");
            return;
        }

        //stpe 2 reinitialize the slow and find the node which cousing the cycle
        slow = head;
        Node previousNode = null;
        while(slow != fast){
            previousNode = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //step 3 point the previos node which is causing the cycle to null
        previousNode.next = null; 

        return ; //foun that no cycle is present in thelinked list
    }

    // fuction to check whether there any cycle or not

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
        head =new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = head; //makeing it to point to head and create a cycle

        System.out.println(detectCycle());
        detectAndRemoveCycle();
        System.out.println(detectCycle());
        
    }
}