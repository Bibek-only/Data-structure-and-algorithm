package questions;

public class _02findTheKthSmallestInTree {
    public static void main(String[] args) {
        binarytree t2 = new binarytree();
        t2.insert(5);
        t2.insert(3);
        t2.insert(6);
        System.out.println("find 1 st null value, 3,5,6, excepted 3");
        System.out.println(t2.findKthSmallest(1));
    }
}
