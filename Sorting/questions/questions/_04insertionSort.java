class insertionSort{

    public static void insertionsort(int arr[]){
        
        for(int i = 1; i<arr.length; i++){
            int current = arr[i]; //tenmprarily save the current cvalue
            int prevIndex = i-1; // found the previous valuse

            while(prevIndex>=0 && current<arr[prevIndex]){
                arr[prevIndex+1] = arr[prevIndex]; 
                prevIndex--;
            }
            arr[prevIndex+1] = current;
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
    insertionsort(arr);
    printArr(arr);
}

}