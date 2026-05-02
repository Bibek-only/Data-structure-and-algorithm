class solution{
    static int methodCall = 0;
    public static int findFionacciSerise(int n){
        methodCall ++;
        if( n == 0 || n == 1){
            return n;
        }
        return findFionacciSerise(n-1) + findFionacciSerise(n - 2);
    }
    public static void main(String args[]){
        int n = 7;
        System.out.println(findFionacciSerise(n));
        System.out.println("for: "+n+" we have to do "+methodCall+ " number of operation" );
    }
}