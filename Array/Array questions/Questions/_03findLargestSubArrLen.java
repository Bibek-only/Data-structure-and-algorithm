public class _03findLargestSubArrLen {

    // function that return the largest subarr length which sum is equal to the given num
    public static int findLen(int arr[],int target){
        int subArrLen = 0;
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                int currentSubArrSum = 0;
                int currentSubArrLen = 0;
                for(int k = i; k<=j; k++){
                    // here all sub array are formed
                    currentSubArrSum += arr[k];
                    currentSubArrLen++;
                }
                if(currentSubArrSum == target && currentSubArrLen>subArrLen){
                    subArrLen = currentSubArrLen;
                }
            }
        }
        return subArrLen;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,1,1,1,1,1};
        System.out.println(findLen(arr,5));
    }
}
