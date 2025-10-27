//here we have 2 arrays and a target and we have to find the combination of array1 and array2 which sum is equal to to the target

//ex, ip, arr1={1,2,4};
//        arr2={3,4,5};
//        target=6
//  op, 2,4 and 1,5

import java.util.*;

class _03findPairs {
    public static ArrayList<int []> findPair(int []arr1,int []arr2,int target){
        Set<Integer> hs = new HashSet<>(); //add first arrays elemets in the arraylist elements
        ArrayList<int []> pairs = new ArrayList<>(); //define arraylist of array to store the arrays
        for(int n:arr1){ //
            hs.add(n);
        }

        for(int n:arr2){
            int required = target - n;
            if(hs.contains(required)){
                pairs.add(new int[]{required,n});
            }
        }

        return pairs;
    }

    //print the pairs
    public static void printPairs(ArrayList<int []> list){
        System.out.print("[ ");
        for(int i=0;i<list.size();i++){
            int tempArr[] = list.get(i);
            System.out.print("[ ");
            for(int j = 0; j<tempArr.length; j++){
                System.out.print(tempArr[j]);
                if(j != tempArr.length-1){
                    System.out.print(",");
                }
            }
            System.out.print(" ]");
            if(i != list.size()-1){
                System.out.print(",");
            }
        }
        System.out.print(" ]");
        System.out.println();
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,4};
        int arr2[] = {3,4,5};
        int target = 6;
        ArrayList<int []> pairs = findPair(arr1, arr2, target);
        printPairs(pairs);
    }
}