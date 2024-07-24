// in the selecton sort we find the smallest element in the entire arr and put the element in the front of the arr

public class _02selectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }

    // function that take a arr and print it
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 6, 4, 5, 8, 10, 7, 9 };
        printArr(arr);
        selectionSort(arr);
        printArr(arr);
    }

}