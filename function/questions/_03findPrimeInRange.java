public class _03findPrimeInRange {

    //find a number is prime or not
    public static boolean isPrime(int n){
        if(n == 1 || n==2){
            return true;
        }

        for(int i = 2; i<n; i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }

    public static void findPrimeInRange(int start, int end){
        for(int i = start; i<=end; i++){
            if(isPrime(i) == true){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        findPrimeInRange(1,100);
    }
}
