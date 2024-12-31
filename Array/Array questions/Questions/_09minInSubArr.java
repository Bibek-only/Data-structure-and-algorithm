public class _09minInSubArr {
    public static int findMinInSubArr(int[] arr){
        if(arr.length <=0){
            System.out.println("no arr element is present");
            return 0;
        }

        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                System.out.print("{");
                int tempSum = 0;
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k]+",");
                    tempSum+=arr[k];
                }
                System.out.print("}");
                if(tempSum < minSum){
                    minSum = tempSum;
                }
                System.out.println();
            }
        }
        return minSum;
    }
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3,-9,-3};
        int minSum = findMinInSubArr(arr);
        System.out.println("the minumum sum of sub arr = "+minSum);
    }
}
