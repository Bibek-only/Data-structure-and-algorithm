// it only contai the lowercase letter

public class _04removeDuplicate {
    
    //for map the letter
    static boolean letterMap[] = new boolean[26];
    


    public static String removeDuplicate(String str){
        if(str.length() <= 1){
            return str;
        }

        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i<str.length(); i++){
            int index = str.charAt(i) - 'a';
            if(letterMap[index] == false){
                sb.append(str.charAt(i));
                letterMap[index] = true;
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicate("bibekaaaaaaa"));
        
        
    }
}
