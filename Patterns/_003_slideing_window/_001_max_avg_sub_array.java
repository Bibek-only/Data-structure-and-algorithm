/*
 * You are given an integer array nums consisting of n elements, and an integer
 * k.
 * 
 * Find a contiguous subarray whose length is equal to k that has the maximum
 * average value and return this value. Any answer with a calculation error less
 * than 10-5 will be accepted.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 * Example 2:
 * 
 * Input: nums = [5], k = 1
 * Output: 5.00000
 */

class solution{
    public static double maxSubArrayAvg(int nums[], int k){
        int len = nums.length;
        if(len < k){
            System.out.println("invalid windown size");
            return 0.0;
        }
        double sum  = 0.0;
        double avg = 0.0;
        double ans = 0.0;
        int i;

        // get the sum of the first windown (windown size = k)
        for(i = 0; i<k; i++){
            sum += nums[i];
        }
        // find the avg of the first window
        avg = (sum * 1.0) / k;
        ans = avg;

        // now find avg for all the windown of the array by right shift the window by q (add the very right element after the windwon sum and substract the very left element of the windown sum)
        for (i = k; i<len; i++){
            sum = (sum + nums[i]) - nums[i - k];
            avg = (sum * 1.0) / k;
            if (avg > ans){
                ans = avg;
            }
        }

        return ans;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5};
        int k = 3;
        double ans = maxSubArrayAvg(nums, k);
        System.out.println(ans); 
    }
}