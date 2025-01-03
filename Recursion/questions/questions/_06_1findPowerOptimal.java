public class _06_1findPowerOptimal {

    public static int findPower(int num, int exponent){

        if( exponent == 0){
            return 1;
        }

        int halfPower = findPower(num, exponent/2);
        int halfPowerSqure = halfPower * halfPower; //compte at returnin time

        if(exponent %2 != 0){
            halfPowerSqure = num * halfPowerSqure; //check at return int time with returning time expoinet value
        }

        return halfPowerSqure;

    }
    public static void main(String[] args) {
        System.out.println(findPower(2,5 ));
    }
}
