class solution{
    static int methodCall = 0;
    static Integer[] memo = new Integer[100]; // data structure for memoization
    public static int findFionacciSerise(int n){
        methodCall ++;
        if(memo[n] != null){ // use the value of subproblem which is already computed
            return memo[n];
        }

        if( n == 0 || n == 1){
            return n;
        }
        
        memo[n] =  findFionacciSerise(n-1) + findFionacciSerise(n - 2); // memoize the new computed subproblem for future use
        return memo[n];
    }
    public static void main(String args[]){
        int n = 7;
        System.out.println(findFionacciSerise(n));
        System.out.println("for: "+n+" we have to do "+methodCall+ " number of operation" );
    }
}