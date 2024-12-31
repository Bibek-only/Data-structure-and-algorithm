public class _06allPossiblePair {

    public static int findPair(int[] arr){
        int totalPair = 0;
        if(arr.length <=0){
            System.out.println("no element present in the arr");
            return 0;
        }
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                System.out.println(arr[i] + "," + arr[j]);
                totalPair++;
            }
        }
        return totalPair;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int totalPair = findPair(arr);
        System.out.println("number of total pair = "+totalPair);
    }
}
