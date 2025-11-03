package questions;

import java.util.ArrayList;
import construct.Heap;

class solution {
    public static Integer findKthSmallElement(int arr[], int k) {

        Heap maxHeap = new Heap();
        for (int n : arr) {
            maxHeap.insert(n); // insert each element to the max Hepa
            if (maxHeap.getHeap().size() > k) { // condition to keep only the smallest 3 element in the heap
                maxHeap.remove();
            }
        }

        return maxHeap.remove(); // return the lartest element form the heap as it only sotre the 3 smallest
                                 // element so the largest or topmost element nothing but the 3rd smallest
                                 // element of the array

    }

    public static void main(String args[]) {
        int arr[] = { 7, 10, 4, 3, 20, 15 };
        int ele = findKthSmallElement(arr, 3);
        System.out.println(ele);
    }
}