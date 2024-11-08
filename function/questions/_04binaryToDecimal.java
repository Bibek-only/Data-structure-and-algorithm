public class _04binaryToDecimal {

    public static int findDecimal(int binary) {

        int answer = 0;
        int flg = 0;
        while (binary > 0) {

            int remender = binary % 10;
            int pw = (int) Math.pow(2, flg);
            flg++;
            answer = answer + (remender * pw);
            binary = binary / 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        int decemal = findDecimal(1010);
        System.out.println(decemal);
    }
}
