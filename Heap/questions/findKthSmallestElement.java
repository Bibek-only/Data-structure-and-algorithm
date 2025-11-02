package questions;
import java.util.ArrayList;
import construct.Heap;
class solution {
    public static Integer findKthSmallElement(int arr[], int k){

        Heap myhep = new Heap();
        for(int n:arr){
            myhep.insert(n);
            if(myhep.getHeap().size()>k){
                myhep.remove();
            }
        }

        return myhep.remove();

    }
    public static void main(String args[]) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        int ele = findKthSmallElement(arr, 3);
        System.out.println(ele);
    }
}