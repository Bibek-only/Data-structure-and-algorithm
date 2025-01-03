public class _04findFirstOccuranceInArr {

    public static int findOccurance(int arr[],int index, int element){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == element){
            return index;
        }
        return findOccurance(arr, index+1, element);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(findOccurance(arr, 0, 6));
    }
}
