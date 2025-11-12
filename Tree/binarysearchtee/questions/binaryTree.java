package questions;

public class binaryTree {
    class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    private boolean isContains(Node currNode,int value){
        if(currNode == null) return false;
        if(currNode.value == value) return true;
        if(value<currNode.value){ //travel left
            return isContains(currNode.left,value);
        }else{ //travel right
            return isContains(currNode.right,value);
        }
        
        
    }

    private Node insert(Node currNode, int value){
        if(currNode == null) return new Node(value);
        if(currNode.value == value) return null;
        if(value<currNode.value){
            currNode.left = insert(currNode.left, value);
        }
        else if(value > currNode.value){
            currNode.right = insert(currNode.right,value);
        }
        return currNode;
    }
    public void insert(int value){
        if(root == null) root = new Node(value);
        insert(root,value);
    }
    public boolean isContains(int value){
        return isContains(root,value);
    }
}
