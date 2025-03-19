import java.util.Stack;

class solution {
    public static boolean isValidParathenis(String str) {
        if (str.length() <= 1) {
            System.out.println("the string has only one character");
            return true;
        }
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') { // check the current charis opening or closing parathencis

                st.push(ch); // if openini push it to the stack

            } else {
                if (st.isEmpty()) { // check if the stack is empty and the parathencies is closing
                    return false;
                }

                if ((st.peek() == '(' && ch == ')') ||
                        (st.peek() == '{' && ch == '}') ||
                        (st.peek() == '[' && ch == ']')) { // validate the parathensis
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        String str = "()[{()}]";
        System.out.println(isValidParathenis(str));
    }
}