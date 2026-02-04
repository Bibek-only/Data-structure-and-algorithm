
// in selectin sort we peek the smallest value for the array and put it in the first, where we do only one swap for one element place
import java.util.Arrays;

class selectionSort {
    public static void selectionSort(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int minIndex = i; // the current min index that track the small value's index in the array
            for (int j = i + 1; j < len; j++) { // find the min index (smallest value index)
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap the minimun value to current position if needed
            if (i != minIndex) {

                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

    }

    public static void main(String args[]) {
        int arr[] = { 2,2, 4, 3, 5, 1, 8, 7, 6 };
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}