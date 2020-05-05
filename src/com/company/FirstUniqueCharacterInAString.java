package com.company;

public class FirstUniqueCharacterInAString {


    public static void main(String[] args) throws Exception {
        System.out.println(firstUniqChar("loveleetcode"));
    }

    public static int firstUniqChar(String s) {
        int[] freq = new int[26];
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            freq[charArray[i] - 'a']++;
        }
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (freq[c - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
