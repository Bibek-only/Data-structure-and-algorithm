package questions;

import java.util.ArrayList;

import construct.Heap;

class findMaximumInAStream {
    public static ArrayList<Integer> streamMax(int arr[]){
        Heap maxHeap = new Heap();
        ArrayList<Integer> maxStream = new ArrayList<>(); //declare to streo the maxsteam values
        for(int n:arr){
            maxHeap.insert(n); //insert int he maxheap to store the max value in the top
            int max = maxHeap.getHeap().get(0); //get the topmost as its is the max value till now
            maxStream.add(max); // insert it in the list ro returning as it contain the max sterm values 

        }
        return maxStream;
    }
    public static void main(String[] args) {
        int arr[] = {10,2,5,1,0,11,6};
        ArrayList<Integer> maxList = streamMax(arr);
        System.out.println(maxList);
    }
}
