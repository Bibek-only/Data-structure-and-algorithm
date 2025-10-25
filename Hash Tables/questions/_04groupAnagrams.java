package questions;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class solution {

    // sort string method
    public static String sortString(String str) {
        char[] charArray = str.toCharArray(); // form an array of charecter out of the string
        Arrays.sort(charArray); // sort the array

        StringBuilder sb = new StringBuilder(); // create a new string builder to form the new sorted array
        for (int i = 0; i < charArray.length; i++) { // add the each element of the array to the string bulder to form
                                                     // the array
            sb.append(charArray[i]);
        }

        return sb.toString();
    }

    // group the anagrams function
    public static ArrayList<ArrayList<String>> groupAnagrams(String[] strArr) {

        HashMap<String, ArrayList<String>> hm = new HashMap<>(); // hash map to store different anagram as a sorted
                                                                 // stirng as key and the anagrams as value in form of
                                                                 // array list

        // arraylist of array list to send the anagrams group
        ArrayList<ArrayList<String>> anagramList = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++) { // travel through the array list to group the anagrms
            String str = strArr[i]; // get the string
            String sortedStr = sortString(str); // get the sorted form of the sting
            ArrayList<String> newList = new ArrayList<>(); // declare list to store the anagrams

            if (hm.get(sortedStr) != null) { // if the key is exits means ther a list so bring the list add the new item
                                             // and update the key of the hashmap with the new array list
                newList = hm.get(sortedStr); // bring the old list
                newList.add(str); // add the new item in the list
                hm.put(sortedStr, newList); // updat the key value
            } else {
                newList.add(str); // as it first time occurr just add the item in the list
                hm.put(sortedStr, newList); // create a nwe key with the sorted string then add the newlist as value
            }
        }

        // put the all entry of the hashmap in an array list of array list
        // ex- [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]

        for (Map.Entry<String, ArrayList<String>> entry : hm.entrySet()) { // trave trough the hash map and add each
                                                                           // value(which is an arraylist) into the
                                                                           // anagrams arral list
            anagramList.add(entry.getValue());
        }

        return anagramList;
    }

    public static void main(String[] args) {
        PrintMethods pm = new PrintMethods();
        String[] strArray = { "eat", "tea", "ate", "tan", "nat", "bat" };
        ArrayList<ArrayList<String>> anagrams = groupAnagrams(strArray);
        pm.printArrayListOfArrayList(anagrams);
    }
}