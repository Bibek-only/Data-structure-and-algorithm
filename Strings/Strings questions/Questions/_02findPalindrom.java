public class _02findPalindrom {
    // function to find the string is palindrom or not
    public static String isPalindrom(String str){
        StringBuilder strbldr1 = new StringBuilder(str);
        StringBuilder strbldr2 = new StringBuilder(str);
        int len = strbldr1.length();
        for(int i = 0; i<len/2; i++){
            int fi = i;
            int si = len-1-i;
            char temp = str.charAt(fi);
            strbldr1.setCharAt(fi,str.charAt(si));
            strbldr1.setCharAt(si,temp);
        }
        System.out.println(str);
        System.out.println(strbldr2);
        if(strbldr1.compareTo(strbldr2) == 0){
            return "the string is palindrom";
        }
        return "not palin drom";
    }
    public static void main(String[] args) {
            System.out.println(isPalindrom("bibekebib"));
    }
}
