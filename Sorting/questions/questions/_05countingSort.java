class countingSort{

    public static void countingsort(int arr[]){
        
        // fint the largest element
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        // make an array to store the frequency
        int frequencyArr[] = new int[largest+1];

        //store the frequency
        for(int i = 0; i<arr.length; i++){

            frequencyArr[arr[i]] = frequencyArr[arr[i]]+1;

        }

        //do the sorting
        int j =0;
        for(int i = 0; i<frequencyArr.length; i++){ //iterate over the frequence arr it soter in which value apper in whic index like in index 1 it sore how many time the 1 is apper int he arr
            while(frequencyArr[i] > 0){
                arr[j] = i;
                j++;
                frequencyArr[i]--;
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
    countingsort(arr);
    printArr(arr);
}

}