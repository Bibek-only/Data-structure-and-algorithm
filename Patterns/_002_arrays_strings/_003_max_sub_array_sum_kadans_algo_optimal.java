class solution {
    public static int maxSubArraySum(int nums[]) {
        int len = nums.length;
        int max_sum = Integer.MIN_VALUE;
        int currentCount = 0;
        for (int i = 0; i < len; i++) {
            currentCount += nums[i];
            if (currentCount > max_sum) {
                max_sum = currentCount;
            }
            if (currentCount < 0) {
                currentCount = 0;
            }

        }
        return max_sum;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, -3, -4 };
        int ans = maxSubArraySum(nums);
        System.out.println(ans);
    }
}