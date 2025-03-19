import java.util.ArrayList;

public class _02stackArrayList {
    static class Stack {
        ArrayList<Integer> stack = new ArrayList<>();

        boolean isEmpty() {
            if (stack.size() == 0) {
                return true;
            }
            return false;
        }

        // push
        boolean push(int data) {
            stack.add(data);
            return true;
        }

        // pop

        Integer pop() {
            if (isEmpty()) {
                System.out.println("stack is empty");
                return null;
            }

            return stack.remove(stack.size() - 1);

        }

        // peek
        Integer peek() {
            if (isEmpty()) {
                System.out.println("stack is empty");
                return null;
            }

            return stack.get(stack.size() - 1);
        }

        //print
        void printStack(){
            
            int currentIndex = stack.size()-1;
            while(currentIndex>=0){
                System.out.println(stack.get(currentIndex));
                currentIndex--;
            }
        }
    }

    public static void main(String[] args) {

        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);

        st.printStack();

    }
}