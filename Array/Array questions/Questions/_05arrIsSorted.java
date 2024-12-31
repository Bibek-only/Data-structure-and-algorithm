// code condition
// you have a arr and you need to find the arr is sorted in asending order or not sortd

public class _05arrIsSorted{
    // function that return true or false based on is the arr is sorted or not
    public static boolean isSorted(int[] arr){
        if(arr.length == 0 || arr.length == 1){
            System.out.println("the are only one or no element in the arr");
            return true;
        }

        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }

        return true;
    }
    public static void main(String args[]){
        
        // provide the arr here
        int[] arr = {1,2,3,4,5,6,7,8,9,12,10};
        System.out.println(isSorted(arr));
    }
}