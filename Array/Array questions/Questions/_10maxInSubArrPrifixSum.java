/* q-> maximum subarr sum
 * in the approach we use a prefix arr which contain all the prefix sum of the arr and on the basis of that we find the the max sum
 * step 1-> find the prefix arr
 * step 2-> defie two variable maxsum and current sum
 * step 3-> fin the all sub arr and its sum by a formul current sum = prefixarr[endindex of arr] - prefixarr[start index of arr]
 * step 4-> conpare the current sum and the max sum and assign the value accordingly
 */
public class _10maxInSubArrPrifixSum {

    public static int findMaxSum(int arr[]){
        int prefixArr[] = new int[arr.length]; //create the prefix sum

        int maxSum = Integer.MIN_VALUE;
        
        prefixArr[0] = arr[0]; //assign the value to the prefix sum
        for(int i = 1; i<arr.length; i++){ 
            prefixArr[i] = prefixArr[i-1] + arr[i];
        }

        for(int i = 0; i<arr.length; i++){
            int tempSum = 0;
            for(int j= i; j<arr.length; j++){
                tempSum =  (i==0)?  prefixArr[j] : prefixArr[j]-prefixArr[i-1]; //edge case chacke for i=0
                
                if(tempSum > maxSum){
                    maxSum = tempSum;
                }
            }
        }
        System.out.println(maxSum);
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        findMaxSum(arr);
    }
}
