//we given a list with values we have to return an list which is have no duplicates

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

class solution{
    public static List<Integer> removeDuplicates(List<Integer> list){
        Set<Integer> nonDuplicates = new HashSet<>(list);
        return new ArrayList<>(nonDuplicates);

    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("before remove duplicates, "+list);
        List<Integer> nonduplicates = removeDuplicates(list);
        System.out.println("after remove the duplicates, -> "+nonduplicates);
    }
}