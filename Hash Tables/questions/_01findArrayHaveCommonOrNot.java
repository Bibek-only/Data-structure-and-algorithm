package questions;
import java.util.HashMap;
 class _01findArrayHaveCommonOrNot {

    public static boolean isArryHaveCommon(int[] arr1, int[] arr2){ //this method findout is there any common element present or not
        HashMap<Integer, Boolean> hs = new HashMap<>();
        
        for(int i = 0; i<arr1.length; i++){
            hs.put(arr1[i],true);
        }

        for(int j = 0; j<arr2.length;j++){
            if(hs.get(arr2[j]) != null){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {5,6,7,8,9};

        System.out.println(isArryHaveCommon(arr1, arr2));
    }
}