// in insertion sort we assume there is 2 part sorted and unsorted , so we took element from the unsorted part and put it in the sorted part.

import java.util.Arrays;

class selectionSort {
    public static void insertionSort(int arr[]) {
        int len = arr.length;
        for (int i = 1; i < len; i++) { // we start the loop from 1 cause we assume the 0th element is already sorted,
                                        // and the i is to track the unsorted part
            int curr = arr[i]; // element which currently need to insert in the sorted part
            int j = i - 1; // to track the sorted part
            while (j >= 0 && curr < arr[j]) {
                arr[j + 1] = arr[j];
                arr[j] = curr;
                j--; // here we move back work to shift the element which is largeer than the current
                     // element
            }

        }

    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 2, 1, 9, 7, 8 };
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}