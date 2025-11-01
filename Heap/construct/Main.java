import java.util.*;

public class Main {
    public static void main(String[] args) {
        Heap myHeap = new Heap();
        ArrayList<Integer> mylist;

        myHeap.insert(95);
        myHeap.insert(75);
        myHeap.insert(80);
        myHeap.insert(55);
        myHeap.insert(60);
        myHeap.insert(50);
        myHeap.insert(65);
        // myHeap.insert(100);
        mylist = myHeap.getHeap();
        System.out.println(mylist);
        myHeap.remove();
        mylist = myHeap.getHeap();
        System.out.println(mylist);
    }
}
