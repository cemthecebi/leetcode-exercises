package com.company;

import java.util.HashSet;

//804. Unique Morse Code Words
public class UniqueMorseCodeWords {

    public static void main(String[] args) throws Exception {

        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> result = new HashSet<>();

        for (String word : words) {
            StringBuilder transformed = new StringBuilder();
            for (char ch : word.toCharArray()) {
                transformed.append(MORSE[ch - 97]);
            }
            result.add(transformed.toString());
        }
        return result.size();
    }
}
