public class _08findNextGreatElementBruteforce{
    public static void findNextGreat(int arr[]){
        for(int i = 0; i<arr.length; i++){
            int current = arr[i];
            for(int j = i+1; j<arr.length; j++){
                if(current < arr[j]){
                    current = arr[j];
                    break;
                }
            }
            if(arr[i] >= current){
                arr[i] = -1;
            }else{

                arr[i] = current;
            }
        }
    }
    public static void main(String args[]){
       int arr[] = {6,8,0,1,3};
       for(int i = 0 ; i<arr.length; i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println();
       findNextGreat(arr);
       
       for(int i = 0 ; i<arr.length; i++){
        System.out.print(arr[i]+" ");
       }
    }
}