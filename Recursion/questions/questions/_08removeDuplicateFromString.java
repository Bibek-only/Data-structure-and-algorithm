/**
 * you give a string only containg the lowercaser character you need to remove the duplicate form that stirng.\
 * 
 * 
 */


public class _08removeDuplicateFromString {
    public static void main(String[] args) {

        boolean arr[] = new boolean[25]; // map the charecters

        String str = "bibeksamalaaaaassssdfdfdddd"; //provide the sting
        System.out.println(str);

        StringBuilder sb = new StringBuilder(""); //empty string builder

        for(int i = 0; i<str.length(); i++){
            
            int index = (int)str.charAt(i) - 'a'; //find the currenter characte's map position

            if(arr[index] == false){ //check if the character is first occured in the map or not
                sb.append(str.charAt(i)); //update the string builder or new string
                arr[index] = true;
            }
        }

        System.out.println(sb);
        
    }
}
