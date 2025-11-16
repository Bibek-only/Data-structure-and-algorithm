package questions;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        binarytree tree = new binarytree();
        tree.insert(2);
        tree.insert(3);
        tree.insert(1);

        ArrayList<Integer> inorder = tree.inOrderTraversal();
        System.out.println(inorder);
    }
}
