//here in the problem statement, we have an array and we have to find the size 
//ex-> ip-> {100,4,200,1,3,2}
//     op-> 4, as the longest consicutive sequence was 1,2,3,4 which length was 4.

import java.util.*;

class solution {
    public static int findLongestConsecutiveSequnce(int arr[]) {

        Set<Integer> hs = new HashSet<>();
        for (int n : arr) { // add the arrayelement in the hashset
            hs.add(n);
        }

        int longestStrek = 0; // capture the longest streak

        for (int n : arr) { // iterate over the array

            if (!hs.contains(n - 1)) { // check each element is the starting point of an sequence or not if yes then
                                       // the preveous value shoul not exits , if exits then skip the element
                int currentSterk = 0; // capture the currentStrek of an seqence
                int currentValue = n; // used to find the next sequence value
                while (true) { // this loop find the next element present in a sequence or not
                    if (!hs.contains(currentValue)) { // check the next element of a sequect presen or not if not then
                                                      // stop
                        break;
                    } else { // if present then update the curent value to next value of it, and the current
                             // sequece by one
                        currentValue++;
                        currentSterk++;
                    }
                }

                longestStrek = Math.max(currentSterk, longestStrek); // update the longestSequence
            }
        }

        return longestStrek;
    }

    public static void main(String[] args) {
        int array[] = { 100, 4, 2000, 2001, 2002, 2003, 2004, 2005, 2006, 1, 3, 2 };
        int longestCongecutiveSequence = findLongestConsecutiveSequnce(array);
        System.out.println(longestCongecutiveSequence);
    }
}