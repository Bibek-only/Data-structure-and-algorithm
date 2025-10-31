import java.util.*;

public class Heap {

    private List<Integer> heap;

    public Heap() {
        this.heap = new ArrayList<>();
    }

    // helper functions

    // 1. get heap
    private List<Integer> getHeap() {
        return new ArrayList<>(this.heap);
    }

    // 2. get the left child index
    private int getLeftChildIndex(int parentIndex) {
        return (2 * parentIndex) + 1;
    }

    // 3. get the right child index
    private int getRightChildIndex(int parentIndex) {
        return (2 * parentIndex) + 2;
    }

    // 4. get the parent of a child
    private int getParentIndex(int childIndex) {
        return (int) (childIndex - 1) / 2;
    }

}