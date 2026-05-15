class solution{
    public static int maxSubArraySum(int nums[]){
        int len = nums.length;
        int maxSubArrSum = Integer.MIN_VALUE;

        for(int i = 0; i<len; i++){
            for(int j = 0; j<len; j++){
                int currentSubArrSum = 0;
                for(int k = i; k<=j; k++){
                    currentSubArrSum += nums[k];
                }
                if(currentSubArrSum > maxSubArrSum){
                    maxSubArrSum = currentSubArrSum;
                }
            }
        }
        return maxSubArrSum;
    }
    public static void main(String[] args) {
            int nums[] = {1,-2,3};
            int ans = maxSubArraySum(nums);
            System.out.println(ans);
    }
}