package constructor;
public class Main {
    
    public static void main(String args[]){
        HashTable hs = new HashTable();
        hs.insert("nail",100);
        hs.insert("bricks", 200);
        hs.insert("rice", 100);
        hs.insert("notes", 500);
        hs.insert("books", 1000);
        hs.insert("pens", 50);
        hs.insert("pkg", 1200000);
        hs.insert("welthy", 100);
        hs.printHashTable();
        
        
    }
}
