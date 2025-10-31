import java.util.*;
public class Main {
    public static void main(String[] args) {
        Heap myHeap = new Heap();

        myHeap.insert(99);
        myHeap.insert(72);
        myHeap.insert(61);
        myHeap.insert(58);
        myHeap.insert(55);
        myHeap.insert(27);
        myHeap.insert(18);

        ArrayList<Integer> newHeap = myHeap.getHeap();
        System.out.println(newHeap); 
        myHeap.insert(100);
        newHeap = myHeap.getHeap();
        System.out.println(newHeap);
    }
}
