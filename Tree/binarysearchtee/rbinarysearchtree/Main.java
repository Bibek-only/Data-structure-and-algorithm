package rbinarysearchtree;

public class Main {

    public static void main(String args[]){
        binarysearchtree tree = new binarysearchtree();
        tree.insert(3);
        tree.insert(2);
        tree.insert(5);
        tree.insert(1);

        tree.rinsert(11);

        boolean isContains = tree.contains(11);
        System.out.println(isContains);
    }
    
}