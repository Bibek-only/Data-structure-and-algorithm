package DDL;

public class Main {
    public static void main(String args[]) {
        DoubleLinkedList ddl = new DoubleLinkedList();
        ddl.append(1);
        ddl.append(2);
        ddl.printDLL();
        ddl.prepend(0);
        ddl.printDLL();
        ddl.removeLastNode();
        ddl.printDLL();
    }
}
