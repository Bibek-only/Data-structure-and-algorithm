// in bubble sort we comparer each node or index with its adjacent index and doen swaping between them according to the condition

public class _1bubbleSort{
    // function that sort the arr into assending order using bubbel sort technique
    public static void boobleSort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // function that take a arr and print it
    public static void printArr(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
            int[] arr = {1,3,2,6,4,5,8,10,7,9};
            printArr(arr);
            boobleSort(arr);
            printArr(arr);
    }
}