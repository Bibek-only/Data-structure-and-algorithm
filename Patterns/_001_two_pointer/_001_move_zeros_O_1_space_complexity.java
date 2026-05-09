import java.util.*;

class solution {
    public static void moveZeroToEnd(int nums[]) {
        int len = nums.length;

        if (len <= 1) {
            return;
        }
        int left= 0;
        for(int right = 0; right<len; right++){
            if(nums[right] != 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }

    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 0, 7, 0, 9, 4, 0, 0 };
        System.out.println(Arrays.toString(nums));
        moveZeroToEnd(nums);
        System.out.println(Arrays.toString(nums));

    }
}