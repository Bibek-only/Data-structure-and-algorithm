public class _03fibonachi {
    
    public static void printFibo(int a, int b,int term){
        if(term == 2){
            return;
        }
        int c = a+b; //calculate the next fibonachhi serise
        System.out.println(c);

        printFibo(b, c, term-1); //call the fucnton

        System.out.println(term);

    }
    public static void main(String[] args){
        int term = 5;
        System.out.println(0);
        System.out.println(1);
        printFibo(0,1,term);
    }
}
