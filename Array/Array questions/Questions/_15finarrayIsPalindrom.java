public class _15finarrayIsPalindrom {

    public static boolean findIsPalindrom(int arr[]){
        if(arr.length == 0 || arr.length == 1){
            return true;
        }

        for(int i = 0; i<=arr.length/2; i++){
            int fi = i; 
            int si = arr.length-i-1;

            if(arr[fi] != arr[si]){
                return false;
            }
        }

        return true;
    }

    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = {};
        printArr(arr);
        System.out.println(findIsPalindrom(arr));
        
    }
}
