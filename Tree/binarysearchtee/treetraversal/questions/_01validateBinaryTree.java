package questions;

public class _01validateBinaryTree {
    public static void main(String[] args) {
        
        binarytree t1 = new binarytree();
         t1.insert(5);
         t1.insert(4);
         t1.insert(6);
         System.out.println("is the tree is a valid tree 5,4,6");
         System.out.println(t1.validateBinaryTree());
    }
}
