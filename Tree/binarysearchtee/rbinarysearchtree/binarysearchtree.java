package rbinarysearchtree;

public class binarysearchtree {
    private Node root;

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (temp.value == value)
                return true;
            if (temp.value > value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }

    }

    public boolean contains(int value) {
        return contains(root, value);
    }

    private boolean contains(Node tempNode, int value) {
        if (tempNode == null)
            return false;
        if (tempNode.value == value)
            return true;
        if (value < tempNode.value) {
            return contains(tempNode.left, value);
        } else {
            return contains(tempNode.right, value);
        }
    }

    public void rinsert(int value) { //inefficent method
        if (root == null) {

            root = new Node(value);
        } else {

            rinsert(root, value);
        }
    }

    private void rinsert(Node temp, int value) { //inefficient method to implemet recursion
        if (temp.value == value)
            return;
        if (value < temp.value) {
            if (temp.left == null) {
                temp.left = new Node(value);
                return;
            } else {
                rinsert(temp.left, value);
            }
        } else {
            if (temp.right == null) {
                temp.right = new Node(value);
            } else {
                rinsert(temp.right, value);
                return;
            }
        }
    }
}
