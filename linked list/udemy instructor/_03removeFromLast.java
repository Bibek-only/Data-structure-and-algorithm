class LinkedList{
    private Node head;
    private Node tail;
    private int length;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public int getLength(){
        return length;
    }
    public int getHeadData(){
        return head.data;
    }
    public int getTailData(){
        return tail.data;
    }
    //constructor to create the linked list
    public LinkedList(int data){
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void appendAtLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    /*
     * Here is the append method that append a node at the end of the linked list
     * 
     */
    public int removeFromLast(){
        if(head == null){
            System.out.println("There is no node present in the linked list");
            return 0;
        }else if(head.next == null){
            int data = head.data;
            head = tail = null;
            return data;
        }else{
            Node prevNode = head;
            Node currNode = head.next;
            while(currNode.next != null){
                currNode = currNode.next;
                prevNode = prevNode.next;
            }
            prevNode.next = null;
            tail = prevNode;
            return currNode.data;
        }
    }
    public static void main(String args[]){
        //here create the object of the LinkedList to create the actual linked list
        LinkedList ll = new LinkedList(1);
        ll.appendAtLast(2);
        ll.appendAtLast(3);
        ll.appendAtLast(4);
        ll.appendAtLast(5);
        System.out.println(ll.removeFromLast());
    }
}