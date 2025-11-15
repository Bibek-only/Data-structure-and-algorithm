package treetraversal;
import java.util.*;

import treetraversal.binaryTree;
public class Main {
    public static void main(String[] args) {
        binaryTree tree = new binaryTree();

        tree.insert(2);
        tree.insert(3);
        tree.insert(1);
        ArrayList<Integer> bfs = tree.BFS();
        System.out.println(bfs);
    }
}
