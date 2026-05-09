import java.util.*;

class solution {
    public static void moveZeroToEnd(int nums[]) {
        int len = nums.length;

        if (len <= 1) {
            return;
        }
        int i = 0;
        Stack<Integer> zero = new Stack<>();
        Stack<Integer> nonZero = new Stack<>();

        for (i = 0; i < len; i++) {
            if (nums[i] == 0) {
                zero.push(nums[i]);
            } else {
                nonZero.push(nums[i]);
            }
        }
        i = 0;
        while (!nonZero.empty()) {
            nums[i++] = nonZero.pop();
        }
        while (!zero.empty()) {
            nums[i++] = zero.pop();
        }

    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 0, 7, 0, 9, 4, 0, 0 };
        System.out.println(Arrays.toString(nums));
        moveZeroToEnd(nums);
        System.out.println(Arrays.toString(nums));

    }
}