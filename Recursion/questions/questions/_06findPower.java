public class _06findPower {
    public static int findPower(int num, int exponent){
        if(exponent == 1){
            return num;
        }
        return num * findPower(num, exponent-1);
    }
    public static void main(String[] args) {
        System.out.println(findPower(2,4));
    }
}
