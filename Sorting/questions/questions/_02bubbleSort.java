public class _02bubbleSort {

    public static void bubbleSort(int arr[]){

        for(int i=0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp;
                }
            }
        }


    }

    //print the arr
    public static void printArr(int arr[]){
        for(int i  = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={1,2,4,3,6,5,8,7,9};
        printArr(arr);
        bubbleSort(arr);
        printArr(arr);
    }
}