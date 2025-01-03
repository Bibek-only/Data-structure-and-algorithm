public class _05lastOccurandeInArr {

    public static int findLastOccurance(int arr[], int index, int element){
        if(index == -1){
            return -1;
        }
        if(arr[index] == element){
            return index;
        }
        return findLastOccurance(arr,index-1, element);
    }
    public static void main(String[] args) {

        int arr[] = {1,2,5,7,9,11,20,21,13,14,21};
        System.out.println(findLastOccurance(arr, arr.length-1, 21));
        
    }
}
