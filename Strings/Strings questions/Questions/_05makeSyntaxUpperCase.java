import java.util.*;
public class _05makeSyntaxUpperCase {
    public static String makeSyntaxUpperCaseBootForse(String str){
        
        String strArr[] = str.split(" ");
        // Stack<String> st = new Stack<>();
        StringBuilder newStr = new StringBuilder("");
        for(int i  = 0; i<strArr.length; i++){
            StringBuilder sb = new StringBuilder(strArr[i]);
            char firstChar = strArr[i].charAt(0);
            sb.setCharAt(0, Character.toUpperCase(firstChar));
            newStr.append(sb+" ");
        }

        return newStr.toString().trim();

        
    }

    //optimal
    public static String makeSyntaxUpperCase(String str){
        
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        
        for(int i = 1; i<str.length(); i++){
            if(str.charAt(i) == 0 && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }

            else{
                sb.append(str.charAt(i));
            }
            
        }


       return sb.toString();

        
    }
    public static void main(String[] args) {
        //
        System.out.println(makeSyntaxUpperCaseBootForse("bibek samal"));
        System.out.println(makeSyntaxUpperCase("bibek samal ok"));
    }
}
