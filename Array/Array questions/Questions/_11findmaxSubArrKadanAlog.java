/*
 * in kadarns algorithem we use a simple trick find the max sub arr sum
 * step 1-> dife 2 variable maxsum and current sum
 * step 2-> iterate the arr
 * step 3-> at each iteration find the current sum by adding the arr element
 * step 4-> check in ever iteration if the maxsum < currentsum then assign the currentsum to max sum
 * stpe 4->when ever the current sum is get negetive make it zero
 */
public class _11findmaxSubArrKadanAlog {

    // print the array
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    //find the max sub arr sum
    public static int findMax(int arr[]){

        if(arr.length == 0){ //base condition
            System.out.println("no arr element is present");
            return 0;
        }

        int maxValue = Integer.MIN_VALUE; 
        int curentSum = 0;

        for(int i = 0; i<arr.length; i++){

            curentSum += arr[i]; //find the current sum

            if(curentSum > maxValue){
                maxValue = curentSum;
            }
            
            if(curentSum<0){
                curentSum = 0;
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
            int arr[] = {1,3,-5,3};
            printArr(arr);
            int ans = findMax(arr);
            System.out.println("the maximun sub arr sum = "+ ans);
    }   
}
