import java.util.Scanner;
public class _01findFactorial{

    //factorial function
    public static int findFactorial(int n){
        if(n<=0){
            return 0;
        }
        int answer = 1;
        for(int i =1; i<=n; i++){
            answer *= i;
        }

        return answer;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 1;
        System.out.println("enter the number");
        n=sc.nextInt();
        int answer = findFactorial(n);
        System.out.println("the factorial of "+n+" = "+answer);
        sc.close();
    }
}