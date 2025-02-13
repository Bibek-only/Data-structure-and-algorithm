public class _02bubbleSort {

    public static void bubbleSort(int arr[]){

        for(int i = 0; i<arr.length-1; i++){

            for(int j = i+1; j<arr.length; j++){ //do the continues swaping

                if(arr[i] > arr[j]){ //do the check
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
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
        int arr[] ={10,20,3,54,95,16,57,28,59};
        bubbleSort(arr);
        printArr(arr);
    }
}