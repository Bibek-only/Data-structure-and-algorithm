import java.util.Stack;

class solution{

    public static boolean isDruplicateParenthsis(String str){
        Stack<Character> st = new Stack<>();
        if(str.length() <= 1 ){
            return true;
        }
        for(int i = 0; i<str.length(); i++){ //traves the string
            char ch = str.charAt(i); //find the current charecter

            if(ch != ')'){ //push the ch if it is not the closing parenthesis
                st.push(ch);
            }

            if(ch == ')'){ // closing condition
                int track = 0;

                while(st.peek() != '(' ){ //pop the charecter until get the opening parenthesis
                    st.pop();
                    track = 1;
                }
                if(track == 0 ){
                    return true;
                }else{
                    st.pop(); //pop the opening parenthesis
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        String str = "(a+b)";
        System.out.println(isDruplicateParenthsis(str));
    }
}