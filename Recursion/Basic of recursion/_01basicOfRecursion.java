public class _01basicOfRecursion{
    // recurions function
    public static void fun(int n){
        if(n>0){
            System.out.println("print n = "+n); //call phase
            fun(n-1);
            System.out.println("return pase n = "+n); //returning phase
        }
    }
    public static void main(String args[]){
        //function call
        fun(5);
    }
}