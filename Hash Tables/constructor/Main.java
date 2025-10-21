package constructor;

public class Main {

    public static void main(String args[]) {

        HashTable hs = new HashTable(); // create the hash table

        hs.insert("nail", 100); // insert key:value in the hash table
        hs.insert("bricks", 200);
        hs.insert("rice", 100);
        hs.insert("notes", 500);
        hs.insert("books", 1000);
        hs.insert("pens", 50);
        hs.insert("pkg", 1200000);
        hs.insert("welthy", 100);

        hs.printHashTable(); // print the hash table

        String key = "pens";
        System.out.println("the value of key "+key+" = "+hs.get(key)); // get the value of a specific key in the hashtable


    }
}
