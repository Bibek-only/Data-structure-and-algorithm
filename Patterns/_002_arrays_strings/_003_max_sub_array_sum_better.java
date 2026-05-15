class solution{
    public static int maxSubArraySum(int nums[]){
        int len = nums.length;
        int maxSubArrSum = Integer.MIN_VALUE;

        for(int i = 0; i<len; i++){
            int currentSubArrSum = 0;
            for(int j = i; j<len; j++){
                currentSubArrSum += nums[j];
                if(currentSubArrSum > maxSubArrSum){
                    maxSubArrSum = currentSubArrSum;
                }
            }
        }
        return maxSubArrSum;
    }
    public static void main(String[] args) {
            int nums[] = {1,-2,3,4};
            int ans = maxSubArraySum(nums);
            System.out.println(ans);
    }
}