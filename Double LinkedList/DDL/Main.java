package DDL;

public class Main {
    public static void main(String args[]) {
        DoubleLinkedList ddl = new DoubleLinkedList();
        ddl.append(1);
        ddl.append(2);
        ddl.printDLL();
        ddl.prepend(0);
        ddl.printDLL();
        ddl.removeLast();
        ddl.printDLL();
        ddl.removeFirst();
        ddl.printDLL();
        System.out.println(ddl.get(1));
        ddl.set(0, 1);
        ddl.printDLL();
        ddl.insert(1, 3);
        ddl.printDLL();
        ddl.insert(1, 2);
        ddl.printDLL();
        ddl.remove(1);
        ddl.printDLL();
    }
}
