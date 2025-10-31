import java.util.*;

public class Heap {

    private List<Integer> heap;

    public Heap() {
        this.heap = new ArrayList<>();
    }

    // helper functions

    // 1. get heap
    public ArrayList<Integer> getHeap() {
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

    // swap two node
    private void swap(int node1Index, int node2Index) {
        int temp = heap.get(node1Index);
        heap.set(node1Index, heap.get(node2Index)); // in the place of the first index put the second index value
        heap.set(node2Index, temp); // in the place of the second index put the second index value
    }

    // insert an node in the heap

    public void insert(int value) {
        heap.add(value); // insert the new value at the last to maintain the complete tree nature of the
                         // heap
        int currIndex = heap.size() - 1; // get the index of the new node

        // run the loop until the new node is get in 0th place means it sithe highest
        // number or then new node placed in the right position where its parent is
        // greater that it
        while (currIndex > 0 && heap.get(currIndex) > heap.get(getParentIndex(currIndex))) { // heap.get(currIndex) get
                                                                                             // the value of the new
                                                                                             // node, and the
                                                                                             // heap.get(getParentIndex(currIndex))
                                                                                             // it get the value of the
                                                                                             // parent of the current or
                                                                                             // the new node

            // swap the curent node with its parent if parend is small the current node
            int parentIndex = getParentIndex(currIndex);
            swap(currIndex, parentIndex);

            // now update the current to the new node's new place or new updated index
            currIndex = getParentIndex(currIndex);
        }

    }

}