class solution{
    static int coutntOperatin = 0;

    public static int findFionacciSerise(int n){
        int fiboSerise[] = new int[n+1];
        fiboSerise[0] = 0;
        fiboSerise[1] = 1;

        for(int i = 2; i<=n; i++){
            coutntOperatin++;
            fiboSerise[n] = fiboSerise[n-1] + fiboSerise[n-2];
        }
        return fiboSerise[n];
    }
    public static void main(String args[]){
        int n = 7;
        System.out.println(findFionacciSerise(n));
        System.out.println("for: "+n+" we have to do "+coutntOperatin+ " number of operation" );
    }
}