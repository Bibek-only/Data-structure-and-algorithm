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

    public void rinserti(int value) { // inefficent method
        if (root == null) {

            root = new Node(value);
        } else {

            rinserti(root, value);
        }
    }

    private void rinserti(Node temp, int value) { // inefficient method to implemet recursion
        if (temp.value == value)
            return;
        if (value < temp.value) {
            if (temp.left == null) {
                temp.left = new Node(value);
                return;
            } else {
                rinserti(temp.left, value);
            }
        } else {
            if (temp.right == null) {
                temp.right = new Node(value);
            } else {
                rinserti(temp.right, value);
                return;
            }
        }
    }

    private Node rinserte(Node currNode, int value) { /// effecient way to implement recursion insertion int bst
        if (currNode == null)
            return new Node(value);// checks we reach the last node or not
        if (value < currNode.value) { // recusive call to the left tree
            currNode.left = rinserte(currNode.left, value);
        } else if (value > currNode.value) { // recursive call to the right tree
            currNode.right = rinserte(currNode.right, value);
        }
        return currNode; // used to popout the element from the stack
    }

    public void rinserte(int value) { // effecient way to implement recusion insertion in bst
        if (root == null) {

            root = new Node(value);
            return;
        } else {

            rinserte(root, value);
        }
    }

    private Node remove(Node currNode, int value){
        if(currNode == null){
            return null;
        }
        if(value < currNode.value){ //travese the left sub tree for removeal
            currNode.left = remove(currNode.left, value);
        }else if(value > currNode.value){
            currNode.right = remove(currNode.right, value); //traverse the right subtree for traversal
        }else{ //we reach the node which we want to remove

            // code for remove the leaf node
             if(currNode.left == null && currNode.right == null){
                return null;
             }
        }

        return currNode;
    }

    public void remove(int value){
        remove(root, value);
    }
}
