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
    
}