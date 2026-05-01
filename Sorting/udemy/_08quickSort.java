
import java.util.Arrays;

class solution{
    // helper function to swap array element
    public static void swappArrayIndexValues(int arr[], int firstIndex, int lastIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }

    // pivot helper function
    public static int getPivotIndex(int arr[], int pivotIndex, int endingIndex){
        int swapIndex = pivotIndex;
        for(int i = pivotIndex+1; i<=endingIndex; i++){
            if(arr[i] < arr[pivotIndex]){
                swapIndex++;
                swappArrayIndexValues(arr, swapIndex, i);
            }
        }
        swappArrayIndexValues(arr, pivotIndex, swapIndex);
        return swapIndex;
    }

    // quick sort
    public static void quickSortHelper(int arr[], int si, int ei){
        if(si < ei){
            int pivot = getPivotIndex(arr, si, ei);
            quickSortHelper(arr, si, pivot-1);
            quickSortHelper(arr, pivot+1, ei);
        }
    }

    public static void quickSort(int arr[]){
        quickSortHelper(arr,0,arr.length-1);
    }
    public static void main(String[] args) {
        int arr[] = {4,6,1,7,3,2,5,4};
        System.out.println(Arrays.toString(arr));
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}