class solution{
    public static int findFact(int n){
        if(n <= 1){
            return 1;
        }else{
            return n*findFact(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(findFact(3));
    }
}