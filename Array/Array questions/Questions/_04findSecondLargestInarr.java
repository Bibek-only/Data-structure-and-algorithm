public class _04findSecondLargestInarr {
    // function that return the second largest number of an arr
    public static int findSecondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]> largest){
                secLargest = largest;
                largest = arr[i];
            }
            if(arr[i]<largest && arr[i]>secLargest){
                secLargest = arr[i];
            }
        }
        return secLargest;
    }
    public static void main(String[] args) {
            int arr[] = {1,2,3,4,5,6,7,8,9};
            System.out.println(findSecondLargest(arr));
    }
}
