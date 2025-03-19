import java.util.HashSet;
public class _16removeDuplicatesfromSortedArrBF {
    public static void printArr(int arr[],int size){
        for(int i = 0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9};

        //print the array
        printArr(arr,arr.length);
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i<arr.length; i++){
            set.add(arr[i]);
        }
        
        int setSize = set.size();
        int j = 0;
        for(int i: set){
            arr[j] = i;
            j++;
        }
        printArr(arr, setSize);
    }
}
