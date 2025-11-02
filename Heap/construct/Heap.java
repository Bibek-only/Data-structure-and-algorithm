package construct;
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

    // shrink down , here we have to shrink down the top most node to ts appopriate
    // postion
    private void shrinkdown(int index) {
        int maxIndex = index;
        while (true) {

            int leftIndex = getLeftChildIndex(maxIndex);
            int rightIndex = getRightChildIndex(maxIndex);
            // check the max index value witht its left child, also check is the left child
            // is a valid index or not child or not
            if (leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)) {
                maxIndex = leftIndex;
            }
            if (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {
                maxIndex = rightIndex;
            }
            if (maxIndex != index) {
                swap(index, maxIndex);
                index = maxIndex;
            } else {
                return;
            }
        }
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

    //remove node, here wer remove the top most node and we don't 
    public Integer remove(){
        if(heap.size() == 0){
            return null;
        }
        else if(heap.size() == 1){
            return heap.remove(0);
        }else{
            //first store the top most element for reutrn
            int removedVariable = heap.get(0);

            //now to make it a balance tree  set the right most node as top mostnot
            heap.set(0,heap.remove(heap.size()-1));

            //now shrink down the new top most node to its appopriate position
            shrinkdown(0);

            return removedVariable;
            
        }
    }

}