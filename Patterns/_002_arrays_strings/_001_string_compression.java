import java.util.*;

class solution {
    public static int stiringCompression(char chars[]) {
        char currentChar;
        int len = chars.length;
        String currentCountString;
        int currentCount = 0;
        int strTrack = 0;
        for(int i = 0; i<len; i++){
            currentChar = chars[i];
            currentCount = 0;
            while(i<len && currentChar == chars[i]){
                i++;
                currentCount++;
            }
            if(currentCount > 1){
                chars[strTrack] = currentChar;
                strTrack++;
                currentCountString = String.valueOf(currentCount);
                for(char ch: currentCountString.toCharArray()){
                    chars[strTrack] = ch;
                    strTrack++;
                }

            }else{
                chars[strTrack] = currentChar;
                strTrack++;
            }
            i--;
        }
        return strTrack;
    }

    public static void main(String args[]) {
        char chars[] = { 'a', 'a', 'a', 'b', 'b', 'b', 'c' };
        System.out.println(Arrays.toString(chars));
        int ans = stiringCompression(chars);
        System.out.println(ans);
        System.out.println(Arrays.toString(chars));
    }
}