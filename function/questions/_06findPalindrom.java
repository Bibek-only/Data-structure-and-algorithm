public class _06findPalindrom {
    public static void findPalindrom(int n){
        int newNum = 0;
        int copy = n;
        while(n>0){
            int r = n%10;
            newNum = newNum * 10 + r;
            n = n/10;
        }
        if(copy == newNum){
            System.out.println("the number "+copy+ " is palindrom");
        }

        else{
            System.out.println("the number "+copy+ " is not palindrom");
        }
    }
    public static void main(String[] args) {
        findPalindrom(51111);
    }
}
