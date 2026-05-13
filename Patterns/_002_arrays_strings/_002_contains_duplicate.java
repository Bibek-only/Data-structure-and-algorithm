import java.util.*;
class solution{
    public static  boolean containsDuplicate(int nums[]){
        Set<Integer> hs = new HashSet<>();
        for(int n:nums){
            if(hs.contains(n)){
                return true;
            }else{
                hs.add(n);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,10,8};
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);
    }
}