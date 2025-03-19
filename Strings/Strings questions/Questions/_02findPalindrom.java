public class _02findPalindrom {
    

    //check the string is plaindrom or not
    public static boolean isPalindromString(String str){
        if(str.length() <=1 ){
            return true;
        }

        
        for(int i =0; i<=str.length()/2; i++){
            int fi = i;
            int li = str.length()-i-1;

            if(str.charAt(fi) != str.charAt(li)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
            // System.out.println(isPalindrom("bibekebib"));
            System.out.println(isPalindromString("bibekebibs"));
    }
}
