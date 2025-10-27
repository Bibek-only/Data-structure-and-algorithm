import java.util.HashSet;
import java.util.Set;
class solution{
    public static void main(String[] args) {
      Set<Integer> set1 =  new HashSet<>();
      Set <Integer> set2 = new HashSet<>();
      Set<Integer> set3 = new HashSet<>();
      Set<Integer> set4 = new HashSet<>();
      
      // add values in set 1
      set1.add(1);
      set1.add(2);
      set1.add(3);
      set1.add(4);
      set1.add(5);
      
      // add values in set 2
      set2.add(4);
      set2.add(5);
      set2.add(6);
      set2.add(7);
      set2.add(8);

      //add values in set3
      set3.add(1);
        set3.add(2);
        set3.add(3);
        set3.add(4);
        set3.add(5);

        //add values in set4
        set4.add(1);
        set4.add(2);
        set4.add(3);
        set4.add(4);
        set4.add(5);

      System.out.println(set1);
      System.out.println(set2);
      System.out.println(set3);
      System.out.println(set4);

      System.out.println("value 5 present in set 1 -> "+set1.contains(5));
      

      //common operations

      //union
      System.out.println("union of set1 with set 2");
      set1.addAll(set2);
      System.out.println("after uinion of set1 and set2 the set1 will be = "+set1);

    //intersection
    System.out.println("intersection of set3 with set2");

    set3.retainAll(set2);
    System.out.println("After intersection of set1 and set2 the set 1 will be = >"+set3);

    //difference
    System.out.println("Difference of set4 with set2");
    set4.removeAll(set2);
    System.out.println("after difference of the set4 with set2 the set4 will be => "+set4);

      
    }
}