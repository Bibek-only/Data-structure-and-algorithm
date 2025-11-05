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
        System.out.println(isContains);
    }

}