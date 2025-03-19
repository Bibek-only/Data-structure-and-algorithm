
public class _01implement{

    
    public static class Stack{
        protected int[] stack;
        private static final int DEFAULT_SIZE = 10;
         int ptr = -1;
        public Stack(){
            this(DEFAULT_SIZE);
        }
        public Stack(int size){
            this.stack = new int[size];
        }

        //push
          boolean push(int data) {
            if(isFull()){

                System.out.println("stack is full");
                return false;
                
                
                
            }
            stack[++ptr] = data;
            return true;
        }

        //pop
         int pop() {
            if(isEmpty()){
                System.out.println("stack is empty");
               return -1;
            }
            return stack[ptr--];
        }

        //peek
        int peek() {
            if(isEmpty()){

                throw new IllegalArgumentException("Stack is empty");
                
            }
            return(stack[ptr]);
        }

        boolean isFull(){
            if(ptr >= stack.length-1){
                return true;
            }
            return false;
        }

        boolean isEmpty(){
            if(ptr == -1){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args){
        Stack st = new Stack(5);
        System.out.println(st.push(1));
        System.out.println(st.push(2));
        System.out.println(st.peek());
    }
}