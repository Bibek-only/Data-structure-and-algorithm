package treetraversal;
import java.util.*;

import treetraversal.binaryTree;
public class Main {
    public static void main(String[] args) {
        binaryTree tree = new binaryTree();

        tree.insert(4);
        tree.insert(2);
        tree.insert(6);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.insert(7);
        System.out.println("breath first search");
        ArrayList<Integer> bfs = tree.BFS();
        System.out.println(bfs);
        System.out.println();

        System.out.println("deapth first search pre order");
        ArrayList<Integer> dfspreorder = tree.preOrderTreeTraversal();
        System.out.println(dfspreorder);
    }
}
