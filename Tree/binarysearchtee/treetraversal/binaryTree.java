package treetraversal;
import java.util.*;

public class binaryTree {
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
    private Node root;

    //insert
    public void insert(int value){
        if(root == null){
            root = new Node(value);
        }else{
            insert(root,value);
        }
    }

    //private function to insert the node
    private Node insert(Node currNode, int value){
        if(currNode == null){
            return new Node(value);
        }
        if(value < currNode.data){
            currNode.left = insert(currNode.left,value);
        }else if(value > currNode.data){
            currNode.right = insert(currNode.right,value);
        }
        return currNode;
    }
    
    public ArrayList<Integer> BFS(){
        Node currNode = root; // initialize the currNode to start the operation.

        Queue<Node> queue = new LinkedList<>(); //define to track which value store in level wise in the list(bfs result)

        ArrayList<Integer> list = new ArrayList<>(); //store the bfs result

        queue.add(currNode);
        while(queue.size() > 0){
            currNode = queue.remove(); 
            list.add(currNode.data); //put the item in correct order
            if(currNode.left != null){
                queue.add(currNode.left);
            }
            if(currNode.right != null){
                queue.add(currNode.right);
            }
        }
        return list;


    }

    public  ArrayList<Integer> preOrderTreeTraversal(){ // defth first search pre order
        ArrayList<Integer> list = new ArrayList<>();

        class POTT{ //class for declareing of  preorder tree traversal function
            public POTT(Node currNode){
                list.add(currNode.data);
                if(currNode.left != null){ //traverse th left subtree
                    new POTT(currNode.left);
                }   
                if(currNode.right != null){ // traverse the right subtree
                    new POTT(currNode.right);
                }
            }
        }
        new POTT(root);
        return list;
    }
    
    public ArrayList<Integer> postOrderTreeTraverSal(){ //defth first search post order
        ArrayList<Integer> list  = new ArrayList<>();
        class PostTraverse{
            public PostTraverse(Node currNode){
                if(currNode.left != null){ // travel the left sub tree
                    new PostTraverse(currNode.left);
                }
                if(currNode.right != null){ //travel the right sub tree
                    new PostTraverse(currNode.right);
                }
                list.add(currNode.data); // after travel the left and the right nodes, add the node in the list
            }
        }
        new PostTraverse(root);
        return list;
    }
    public ArrayList<Integer> inOrderTreeTraversal(){
        ArrayList<Integer> list = new ArrayList<>();
        class InorderTraverse{ //class for define the recursive class
            public InorderTraverse(Node currNode){ //recursion function
                if(currNode.left != null){ //traverse the left nodes or sub tree if available
                    new InorderTraverse(currNode.left); 
                }
                list.add(currNode.data); //after visiting the left sub tree and nodes put it in the nodes
                if(currNode.right != null){ //traverse the right nodes or sub tree if available
                    new InorderTraverse(currNode.right);
                }
            }
        }
        new InorderTraverse(root);
        return list;
    }
}