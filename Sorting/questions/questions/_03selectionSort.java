class selectionSort{

    public static void selectionsort(int arr[]){
        
        for(int i = 0; i<arr.length-1; i++){
            int smallIndex = i;
            for(int j = i+1;j<arr.length; j++){

                if(arr[j] < arr[smallIndex]){ //find out the the index of the smalles elemet in the array
                    smallIndex = j;
                }
            } 

            int temp = arr[i]; //swap the smallest element with the current position
            arr[i] = arr[smallIndex];
            arr[smallIndex] = temp; 
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
    selectionsort(arr);
    printArr(arr);
}

}