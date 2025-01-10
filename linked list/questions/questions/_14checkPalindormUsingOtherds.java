public class _14checkPalindormUsingOtherds {

    static class LinkedList{
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

        //check palindrom or not using string
        boolean checkPalindrom(){
            StringBuilder sb = new StringBuilder("");

            Node currentNode = head;
            while(currentNode !=null ){
                sb.append(String.valueOf(currentNode.data));
                currentNode = currentNode.next;

            }
            
            String str = sb.toString();
            String str2 = sb.reverse().toString();
            
            int res = str.compareTo(str2);
            if(res<0){
                return false;
            }else{
                return true;
            }
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
            Node currentNode = head;
            while(currentNode != null){
                System.out.print(currentNode.data+"-> ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      LinkedList ll = new LinkedList();
      ll.addLast(11);  
      ll.addLast(2);  
      ll.addLast(3);  
      ll.addLast(2);  
      ll.addLast(11);  
    
      ll.printLL();
      System.out.println(ll.checkPalindrom());

    }
}