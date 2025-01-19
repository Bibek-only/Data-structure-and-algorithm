import java.util.*;

public class _05reverString {

    public static String reverString(String str){
        if(str.length() <=1){
            return str;
        }
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder("");

        for(int i = 0; i<str.length(); i++){
            stack.push(str.charAt(i));
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop().toString());
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        
          String str = "ab";
          System.out.println(str);
          System.out.println(reverString(str));     
    }
}
