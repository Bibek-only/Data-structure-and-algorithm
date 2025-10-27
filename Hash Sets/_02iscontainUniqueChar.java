// we have an string and we have to check whether it has uniq charecter or not\
// ex ip - str=bibek, op - false //contains duplicates
// ex ip - str=nokia, op - true //contains only unique charecter

import java.util.*;
class solution{
    public static boolean isContainsUniqueCharecter(String str){
        Set<Character> hs = new HashSet<>();
        for(int i = 0 ;i<str.length(); i++){
            if(hs.contains(str.charAt(i))){
                return false;
            }else{
                hs.add(str.charAt(i));
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "nokia";
        boolean res = isContainsUniqueCharecter(str);
        System.out.println(res);
    }
}