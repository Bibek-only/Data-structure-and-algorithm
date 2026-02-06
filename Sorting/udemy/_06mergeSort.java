import java.util.Arrays;

class mergeSort {

    public static int[] mergeSorts(int arr[]) {

        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int leftArr[] = mergeSorts(Arrays.copyOfRange(arr, 0, mid));
        int rightArr[] = mergeSorts(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(leftArr, rightArr);

    }

    public static int[] merge(int arr1[], int arr2[]) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int mergedLen = len1 + len2;

        int mergedArray[] = new int[mergedLen];
        int i = 0, j = 0, k = 0;

        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
                k++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < len1) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }
        while (j < len2) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }
        return mergedArray;

    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 3, 1, 6, 5, 7, 9, 8 };
        System.out.println(Arrays.toString(arr));
        int SortedArr[] = mergeSorts(arr);
        System.out.println(Arrays.toString(SortedArr));
    }
}