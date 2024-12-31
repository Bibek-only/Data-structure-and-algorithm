public class _07findAllSubArr {
    public static int findSubArr(int[] arr){
        if(arr.length <=0){
            System.out.println("no arr element is present");
            return 0;
        }

        int totalSubArr = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                System.out.print("{");
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k]+",");
                }
                System.out.print("}");
                totalSubArr++;
                System.out.println();
            }
        }
        return totalSubArr;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int totalSubArr = findSubArr(arr);
        System.out.println("the total subarr = "+totalSubArr);
    }
}
