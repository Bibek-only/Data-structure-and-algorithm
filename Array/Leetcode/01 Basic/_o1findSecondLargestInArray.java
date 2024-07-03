// description
// you have a array and you need to find the second largest of the array
// ex-> [1,2,3,4,5,6,7,8]
// output -> the second largest of the array = 7

public class _o1findSecondLargestInArray {
    public static int findSecondLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        // base condition
        if(arr.length == 1 || arr.length == 0){
            System.out.println("canot find the second largest due to the length is too short");
            return Integer.MIN_VALUE;
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String args[]) {
        int arr[] = {5, -3, 0, 12, -7, 8, -1, 0, 3, -6, 15, -9, 2, 0, -4};
        System.out.println("the second largest number of the array = "+findSecondLargest(arr));
        
    }
}