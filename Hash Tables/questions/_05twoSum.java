// here in this problema we have an array and a target and we have to find the index of the array by which when we add the value of the indexs we get the target

//ex-> ip-> {1,2,3,4} target = 7
// op-> {2,3}


package questions;

import java.util.HashMap;
import java.util.Map;

class solution{

    public static int[] twoSum(int []arr, int target){

        HashMap<Integer, Integer> hm = new HashMap<>(); // hash map to store each array value and its index
        
        for(int i = 0; i<arr.length; i++){
            //find the required value in which if we add the current value then it give the target
            int requiredVal = target - arr[i];

            // check if the required value exits as a key in the hash map or not 
            if(hm.get(requiredVal) != null){
                return new int[]{hm.get(requiredVal),i}; //create a new array and return which contain the index

            }else{
                hm.put(arr[i],i); //if the required value is not exit in the hashmap as key then add it with its index, her i is th index 
            }

        }
        return new int[]{}; //if not find the combination then return an empty array
    }

    public static void main(String args[]){

        PrintMethods pm = new PrintMethods();

        int []array = {1,2,3,4,5,6,7,8,9};
        int target = 7;

        int indexes[] = twoSum(array, target);
        pm.printArray(indexes);

    }
}
