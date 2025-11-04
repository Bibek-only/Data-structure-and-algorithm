package constructor;
public class binarysearchtree {
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

    // defint the root node
    private Node root;

    //insert method
    public boolean insert(int value){
        //create the new node
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
            return true;
        }else{
            Node tempNode = root;
            while(true){
                // binary trees only contains the unique values
                if(newNode == tempNode) return true;
                
                //check the value is valid or not
                if(tempNode.value > newNode.value){ //insert in the left side of the current node
                    if(tempNode.left == null){
                        tempNode.left = newNode;
                        return true;
                    }else{
                        tempNode = tempNode.left;
                    }
                }else{ //insert the right side of the curren node
                    if(tempNode.right == null){
                        tempNode.right = newNode;
                        return true;
                    }else{
                        tempNode = tempNode.right;
                    }
                }
            }
        }
        
    }
    public boolean isContains(int value){
        if(root == null) return false; //if there is node then reutrn
        Node temp = root;
        while(true){
            if(temp == null) return false; //return if the temp is null, means ther is no value
            if(temp.value == value) return true; //return true if the value we found
            if(temp.value > value){ //traverse the left of the tree
                temp = temp.left;
            }else{
                temp = temp.right; //traverse the right
            }

        }
    }
}