package constructor;
public class HashTable{
    private int size  = 7;
    private Node[] dataMap; //it is an arry of nodes means it store the addres off linked list as we use separate channing for hash tables
    
    public class Node{ // each node is represend different key and value
        String key;
        int value;
        Node next;
        public Node(String key, int value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public HashTable(){
        dataMap = new Node[size];   
    }

    public void insert(String key, int value){ //this method take key and value , generate hash and put it in the data map using separate chaning.

        int hash = generateHash(key); //thsi find the key to store the key value pair
        Node newNode  = new Node(key, value); //this create the node tht create form the key and value to store

        if(dataMap[hash] == null){ // it means there is no key value (node) is present in the specific index
            dataMap[hash] = newNode;
        }else{
            Node temp = dataMap[hash];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }
    public int generateHash(String key){ // this method take a key and generate an unique index 0-7 which is hash and return it
        int hash = 0;
        char charArr[] = key.toCharArray();
        for(int i = 0; i<charArr.length; i++){
            int assiValue = charArr[i];
            hash = (hash + assiValue * i) % dataMap.length;
        }
        return hash;
    }

    public void printHashTable(){ //method to print the hash table
        int len = dataMap.length;
        for(int i = 0; i<len; i++){
            System.out.print(i+"->");
            Node temp = dataMap[i];
            while(temp != null){
                System.out.print("{ "+temp.key+" , "+temp.value+" } -> ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}