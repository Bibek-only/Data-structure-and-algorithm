public class _01reverseString{
    // function that rever the string
    public static void reverString(String str){

        StringBuilder strbldr = new StringBuilder(str);
        int len = strbldr.length();

        for(int i = 0; i<len/2; i++){

            int fi = i; //find the correspoinding indexs
            int si = len-1-i;

            char temp = str.charAt(fi);
            strbldr.setCharAt(fi,str.charAt(si));
            strbldr.setCharAt(si,temp);

        }
        
        System.out.println(str);
        System.out.println(strbldr);
    }
    public static void main(String args[]){
        String str = "bibek smala";
        reverString(str);
    }
}