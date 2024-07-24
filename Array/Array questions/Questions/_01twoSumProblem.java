// code condition
// there must be a combination in the arr which sum is equal to the target
// the arr must not be null and contain atlest 2 value 

public class _01twoSumProblem {

    // function to find the 2 sum problem
    public static void findTwoSum(int[] arr, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        System.out.println(ans[0]+ " , "+ans[1]);
        
    }

    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,6,7};

        findTwoSum(arr,10);
    }
}