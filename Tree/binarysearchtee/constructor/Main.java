package constructor;

public class Main {
    public static void main(String[] args) {
        binarysearchtree bst = new binarysearchtree();
        bst.insert(3);
        bst.insert(1);
        bst.insert(2);
        bst.insert(4);
        bst.insert(5);
        System.out.println(bst.isContains(11));
    }
}
