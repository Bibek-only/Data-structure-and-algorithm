import java.util.*;

class solution {
    public static String rev(String str) {
        StringBuilder sb = new StringBuilder();

        Stack<Character> st = new Stack<>();

        for (char c : str.toCharArray()) {
            st.push(c);
        }

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "bibek";
        String revStr = rev(str);
        System.out.println(revStr);
    }
}