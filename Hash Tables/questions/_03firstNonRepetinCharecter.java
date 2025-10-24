package questions;

import java.util.LinkedHashMap;
import java.util.Map;

class solution {
    public static Character firstNonRepeatingChar(String str) {
        LinkedHashMap<Character, Integer> hs = new LinkedHashMap<>(); //to store the frequencyof the charecter of the sting
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hs.get(ch) != null) {
                hs.put(ch, hs.get(ch) + 1);
            } else {
                hs.put(ch, 1);
            }
        }

        System.out.println(hs);

        Character nonRepeting = null;
        for (Map.Entry<Character, Integer> entry : hs.entrySet()) { //find the first
            if (entry.getValue() == 1) {
                nonRepeting = entry.getKey();
                break;
            }
        }

        
        return nonRepeting;

    }

    public static void main(String[] args) {
        Character nonRepeting = firstNonRepeatingChar("alphabate");
        System.out.println(nonRepeting);
        
    }
}
