package questions;

import java.util.ArrayList;

public class PrintMethods {
    public void printArray(int []array){
        System.out.print("[ ");
        for(int i = 0; i<array.length; i++){
            
            System.out.print(array[i]);
            if(i != array.length-1){
              System.out.print(",");  
            }
        }
        System.out.print(" ]");
        System.out.println();
    }

    public void printArrayList(ArrayList<Integer> array){
        System.out.print("[ ");
        for(int i = 0; i<array.size(); i++){
            
            System.out.print(array.get(i));
            if(i != array.size()-1){
              System.out.print(",");  
            }
        }
        System.out.print(" ]");
        System.out.println();
    }

}
