package questions;

import java.util.ArrayList;

public class PrintMethods {
    public void printArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print(" ]");
        System.out.println();
    }

    public void printIntArrayList(ArrayList<Integer> array) {
        System.out.print("[ ");
        for (int i = 0; i < array.size(); i++) {

            System.out.print(array.get(i));
            if (i != array.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.print(" ]");
        System.out.println();
    }

    public void printArrayListOfArrayList(ArrayList<ArrayList<String>> alal) {
        if (alal == null) {
            return;
        }
        System.out.print("[ ");
        for (int i = 0; i < alal.size(); i++) {
            System.out.print(" [ ");
            for (int j = 0; j < alal.get(i).size(); j++) {
                System.out.print(alal.get(i).get(j));
                if (j != alal.get(i).size() - 1) {
                    System.out.print(",");
                }
            }
            System.out.print(" ] ");
            if (i != alal.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.print(" ]");
        System.out.println();
    }

}
