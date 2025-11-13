package questions;

public class binaryTree {
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

    private Node root;

    private boolean isContains(Node currNode, int value) {
        if (currNode == null)
            return false;
        if (currNode.value == value)
            return true;
        if (value < currNode.value) { // travel left
            return isContains(currNode.left, value);
        } else { // travel right
            return isContains(currNode.right, value);
        }

    }

    private Node convertSortedArrayToBalancedBst(int arr[], int si, int ei) { // function to conver the sorted array to
                                                                              // bst
        if (si > ei) { // check ther si any noder present or not
            return null;
        }
        int mid = si + (ei - si) / 2; // find the current root(value) ned to construct
        Node currentRoot = new Node(arr[mid]); // creat the current root
        currentRoot.left = convertSortedArrayToBalancedBst(arr, si, mid - 1); // construct the left sub tree
        currentRoot.right = convertSortedArrayToBalancedBst(arr, mid + 1, ei); // construct the right sub tree
        return currentRoot; // reutn the root
    }

    public void convertSortedArrayToBalancedBst(int arr[]) {
        root = convertSortedArrayToBalancedBst(arr, 0, arr.length - 1);
    }

    public boolean isContains(int value) {
        return isContains(root, value);
    }

    private Node insert(Node currNode, int value) {
        if (currNode == null) {
            return new Node(value);
        }
        if (value < currNode.value) {
            currNode.left = insert(currNode.left, value);
        } else if (value > currNode.value) {
            currNode.right = insert(currNode.right, value);
        }
        return currNode;
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            insert(root, value);
        }
    }

    private Node mirror(Node currNode){
        if(currNode == null){
            return null;
        }
        Node temp = currNode.left;
        currNode.left = mirror(currNode.right);
        currNode.right = mirror(temp);

        return currNode;
    }

    public void mirror(){
        mirror(root);
    }
}
