public class _05decimalToBinary {
    public static void decimalToBinary(int decimal){
        int binary = 0;
        int flg = 0;
        while(decimal > 0){
            int remeder = decimal % 2;
            binary = binary + remeder*((int)Math.pow(10,flg));
            flg++;
            decimal = decimal / 2 ;
        }
        System.out.println(binary);
    }
    public static void main(String[] args) {
        decimalToBinary(12);
    }
}
