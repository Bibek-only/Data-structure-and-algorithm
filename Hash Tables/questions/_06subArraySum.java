//int the proble statement we have an array, and an target, and we have to find out the subarray(si, ei) which sum is form the target
// example-> arr={1,2,3,4,5}, target = 9, op={ 1,3 };

//if ther is no subarry which sum si not equal to the target then simple return an empty array
// example-> arr={1,2,3,4,5}, target = 90, op={ };

package questions;

import java.util.Map;
import java.util.LinkedHashMap;

class solution {

    public static int[] findSubArray(int[] arr, int target) {

        // declare the hashmap to store the current sum and the array index at which the
        // currem sum was
        // where key = current sum and value is the index
        Map<Integer, Integer> hm = new LinkedHashMap<>();

        hm.put(0, -1); // put the first entry to handel an exception case if the suberray index
                       // starting from the 0

        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {

            currentSum = currentSum + arr[i]; // get the curren sum of a perticular index
            int diff = currentSum - target; // get the diff to used it to find the key with the value exits or not
            if (hm.containsKey(diff)) {
                int si = hm.get(diff) + 1; // strting index will be the next keys value, as the values storeed in order
                                           // as the array so we can access it by adding 1
                int ei = i; // ending index is the current index , in which we find the curren sum and the
                            // diff whis exits in the hasm map as key
                return new int[] { si, ei };
            } else {
                hm.put(currentSum, i); // put the current sum as key and the index in which we find the current sum as
                                       // value
            }

        }

        return new int[] {};

    }

    public static void main(String[] args) {
        PrintMethods pm = new PrintMethods();
        int arr[] = { 1, 2, 3, 4, 5 };
        int target = 9; // op = 1,3

        int[] indexes = findSubArray(arr, target);
        pm.printArray(arr);
        pm.printArray(indexes);
    }
}