import java.util.LinkedList;

public class _11reverLinkedListNodevalue {

    public static void main(String[] args) {

        // create the linked list
        LinkedList<Number> ll = new LinkedList<Number>();
        ll.add(13);
        ll.add(24);
        ll.add(35);
        ll.add(46);
        ll.add(57);

        System.out.println(ll);

        // iterate the linked list
        for (int i = 0; i < ll.size(); i++) {
            int currentNumber = (int) ll.get(i);

            // cover the number to stringbuilder and reverse it and make it number again
            int reverse = Integer.parseInt(new StringBuilder(String.valueOf(currentNumber)).reverse().toString());
            ll.set(i, reverse);
        }

        System.out.println(ll);

    }

}
