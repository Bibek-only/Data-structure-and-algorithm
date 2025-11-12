package questions;

public class convertSortedArrayToBalancedBst {

    public static void main(String[] args) {
        binaryTree tree = new binaryTree();
        int arr[] = {1,2,3}; // sorted array need to convert
        tree.convertSortedArrayToBalancedBst(arr); // ocnverte the sorted arry to balanced bast
        System.out.println(tree.isContains(3)); //check the tre is reated or not
        
    }
}
