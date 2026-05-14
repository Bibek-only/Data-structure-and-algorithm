class solution {
    public static boolean isVowel(char ch) { //helper function to check itis vowel of not
        if (ch == 'a' ||
                ch == 'e' ||
                ch == 'i' ||
                ch == 'o' ||
                ch == 'u') {
            return true;
        } else {
            return false;
        }
    }

    public static int maxVowels(String s, int k) {
        int len = s.length();
        int si = 0;
        int ei = k - 1;
        int maxCount = 0;
        int currentCount = 0;

        while (ei < len) {
            currentCount = 0;
            for (int i = si; i <= ei; i++) { // find the current windwos maximum number of vowels
                if (isVowel(s.charAt(i))) {
                    currentCount++;
                }
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
            si++;
            ei++;
        }
        return maxCount;
    }

    public static void main(String[] args) {
        String str = "aefibcei";
        int k = 3;
        int ans = maxVowels(str, k);
        System.out.println(ans);
    }
}