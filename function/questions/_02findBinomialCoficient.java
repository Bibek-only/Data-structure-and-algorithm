public class _02findBinomialCoficient {

    public static int findFactorial(int n){
        if(n<=0){
            return 1;
        }

        int answer = 1;

        for(int i = n; i>=1; i--){
            answer*=i;
        }

        return answer;
    }

    public static int findBinomialCofficient(int n, int r){
        int nFact = findFactorial(n);
        int rFact = findFactorial(r);
        
        int nminusrFact = findFactorial(n-r);
        int answer = nFact/(rFact*nminusrFact);
        System.out.println(answer);
        return answer;
       
    }
    public static void main(String[] args) {
        int answer = findBinomialCofficient(5,2);
        System.out.println("the vinomial coficient = "+answer);
    }
}
