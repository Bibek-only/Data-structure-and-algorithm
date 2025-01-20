import java.util.Stack;
public class _06reverseStack {

    static void pushAtButtom(Stack<Integer> stack, int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }

        int popedData = stack.pop();
        pushAtButtom(stack, data);
        stack.push(popedData);
        
    }

    static void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int popedData = stack.pop();
        reverseStack(stack);
        pushAtButtom(stack, popedData);
    }


    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);

       System.out.println(stack);
       reverseStack(stack);
       System.out.println(stack);
        
    }
}
