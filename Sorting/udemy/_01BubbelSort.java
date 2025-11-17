import java.util.*;

class solution{
    public static void main(String args[]){
        int arr[] = {6,4,3,5,1,2};
        System.out.println("Before the sorting");
        System.out.println(Arrays.toString(arr));

        
        for(int i = arr.length-1; i>0; i--){ // for n input the loop should run n-1 time
            for(int j = 0; j<i; j++){ 

                if(arr[j]>arr[j+1]){ //do the saap if the element greater than the next of it 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("after bubbol sort the array will be");
        System.out.println(Arrays.toString(arr));
    }
}