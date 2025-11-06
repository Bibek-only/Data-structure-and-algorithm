package rbinarysearchtree;

public class Main {

    public static void main(String args[]) {
        binarysearchtree tree = new binarysearchtree();
        tree.insert(3);
        tree.insert(2);
        tree.insert(5);
        tree.insert(1);

        tree.rinserti(11); // inefficient recursive insert
        tree.rinserte(22); //efficient recursinve insert

        boolean isContains = tree.contains(22);
        System.out.println("is the 22 is inserted in the tree: "+isContains);
        
        //remove the 23 which is not present in the tree
        tree.remove(23);

        //lets remove the leaf node 22 and 1 and check is it removed form the tree or not

        System.out.println("values 1 and 22 is contain before remove: "+tree.contains(1)+" , "+tree.contains(22));
        tree.remove(22);
        tree.remove(1);
        System.out.println("values 1 and 22 is contain after remove: "+tree.contains(1)+" , "+tree.contains(22));
        
        
    }

}