public class _03stackLinkedList {

    public static class Stack{
        class Node{
            int data;
            Node next;
            public Node(int data){
                this.data = data;
                this.next = null;
            }


        }

        Node head = null;
       
        boolean isEmpty(){
            if(head == null){
                return true;
            }else{
                return false;
            }
        }

        //push operation

        boolean push(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            return true;
            

        }

        //pop operation
        Integer pop(){
            if(isEmpty()){
                return null;
            }

            int popedData = head.data;
            head = head.next;
            return popedData;


        }

        Integer peek(){
            if(isEmpty()){
                return null;
            }
            return head.data;
        }

        
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        System.out.println("the current element "+stack.peek());
        System.out.println("the poped data "+stack.pop());        
        System.out.println("the current element "+stack.peek());
    }
}
