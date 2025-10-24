package questions;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

class solution {
    // method to find the duplicate value
    public static ArrayList<Integer> findDuplicates(int[] array) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < array.length; i++) { // collect the frequency of each item of the array
            int item = array[i];
            if (hs.get(item) != null) {
                hs.put(item, hs.get(item) + 1);
            } else {
                hs.put(item, 1);
            }
        }

        // put the entry (key) in the array list if it frequency is >1
        for (Map.Entry<Integer, Integer> entry : hs.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;

    }

    public static void main(String args[]) {

        PrintMethods pm = new PrintMethods();
        int[] array = { 1, 2, 3, 4, 5 ,5, 4};
        ArrayList<Integer>  duplicates = findDuplicates(array);
        pm.printArrayList(duplicates);

        
        
        
    }
}

// input [1,1,2,2,3,4]
// output [1,2]

// input [1,2,3

// input [-1, 0, 1, 0, -1, -1, 2, 2]
// output[-1, 0, 2]

// input []
// output []

// input [3, 3, 3, 3, 3]
// output [3]