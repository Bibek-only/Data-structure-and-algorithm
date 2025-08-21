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
    public static void main(String args[]){
        //here create the object of the LinkedList to create the actual linked list
        LinkedList ll = new LinkedList(1);
        System.out.println(ll.getHeadData());
        System.out.println(ll.getTailData());
        System.out.println(ll.getLength());
    }
}