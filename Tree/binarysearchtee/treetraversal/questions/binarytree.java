package questions;
import java.util.*;

public class binarytree {
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    private Node root;

    public void insert(int data){
        if(root == null){
            root = new Node(data);
        }
        Node currNode = root;
        //if the value exist then return
        while(true){
            if(currNode.data == data){
                return;
            }
            //travel left and find the right postion to insert
            else if(data<currNode.data){
                if(currNode.left == null){
                    currNode.left = new Node(data);
                    return;
                }
                currNode = currNode.left;
            }

            //trael right and find the right postion to insert
            else if(data>currNode.data){
                if(currNode.right == null){
                    currNode.right = new Node(data);
                    return;
                }
                currNode = currNode.right;
            }
        }
        
        
    }

    public ArrayList<Integer> inOrderTraversal(){
        ArrayList<Integer> list = new ArrayList<>();
        class INOT{ //in order traversal
            public INOT(Node currNode){
                if(currNode.left != null){ //if left sub tree is present travel it
                    new INOT(currNode.left);
                }
                list.add(currNode.data);
                if(currNode.right != null){ //if right sub tree is prsent travel it
                    new INOT(currNode.right);
                }
            }
        }
        new INOT(root);
        return list;
    }

    public boolean validateBinaryTree(){
        ArrayList<Integer> list = inOrderTraversal(); //get the tree as a sorted list using inorder traversal

        int len = list.size();
        int i = 0;
        int j = 1;
        while(j<len){
            if(list.get(i)>list.get(j)){ //check the next element of an element is small or not if yes means it not a valid tre return false
                return false;
            }
            i++;
            j++;
        }
        return true;

    }
}
