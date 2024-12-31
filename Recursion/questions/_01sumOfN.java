
public class _01sumOfN{
    public static int findSum(int n){
        
       if(n == 0){
        return 0;
       }
       
       return n + findSum(n-1);
    }
    public static void main(String[] args){
        
        System.out.println(findSum(5));
    }
}