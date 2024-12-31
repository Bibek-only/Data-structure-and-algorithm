public class _06findPower {
    public static int findPower(int x, int n){
        if(n == 1){
            return x;
        }
        return x * findPower(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(findPower(2,4));
    }
}
