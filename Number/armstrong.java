import java.util.*;
public class armstrong {
    public static boolean isArmStrong(int num){ //find the number is armsting or not
        int copy = num; 
        int newNum = 0;
        int numLen = (int)String.valueOf(num).length(); //get the number of the digit present in the digit
        while(num!=0){
            int r  = num % 10;
            newNum += (int)Math.pow(r,numLen);
            num = num / 10;
        }
        if(newNum == copy){
            return true;
        }else{
            return false;
        }
    }
    public static ArrayList<Integer> findArmstrongInRange(int s, int e){ //find the number of armstrong number present in a range
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = s; i<=e; i++){
            if(isArmStrong(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int num = 153;
        boolean res = isArmStrong(num);
        System.out.println(res);
        int s = 1;
        int e = 1000;
        ArrayList<Integer> list = findArmstrongInRange(s, e);
        System.out.println(list);
    }
}
