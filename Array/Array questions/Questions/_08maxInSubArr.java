
public class _08maxInSubArr {
    public static int findSubArr(int[] arr){
        if(arr.length <=0){
            System.out.println("no arr element is present");
            return 0;
        }

        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                System.out.print("{");
                int tempSum = 0;
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k]+",");
                    tempSum+=arr[k];
                }
                System.out.print("}");
                if(tempSum > maxSum){
                    maxSum = tempSum;
                }
                System.out.println();
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        int maxSum = findSubArr(arr);
        System.out.println("the max sum of sub arr = "+maxSum);
    }
    
}