package questions;

import questions.binaryTree;

public class mirrorAbinaryTree {

    public static void main(String[] args) {
        
        binaryTree tree = new binaryTree();
        tree.insert(4);
        tree.insert(2);
        tree.insert(6);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.insert(7);
        tree.mirror();
    }
}