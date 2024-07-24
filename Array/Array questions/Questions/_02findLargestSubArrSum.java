public class _02findLargestSubArrSum{
    // function that return the largest sub arr sum of a arr
    public static int findSum(int arr[]){
        if(arr.length == 0){
            System.out.println("there is no arr element");
            return -1;
        }
        int ans = Integer.MIN_VALUE;

        // finding the all sub arr and there sum
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                int currentSum = 0;
                for(int k = i; k<=j; k++){
                    currentSum = currentSum + arr[k];
                }
                if(currentSum > ans){
                    ans = currentSum;
                }
            }
        }

        return ans;
    } 
    public static void main(String args[]){

        // here change the arr accordingly 
        int arr[] = {1,-2,4,6,-46,2};
        int ans = findSum(arr);
        System.out.println(ans);
    }
}