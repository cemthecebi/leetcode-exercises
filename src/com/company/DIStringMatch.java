package com.company;

import java.util.Arrays;

public class DIStringMatch {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(diStringMatch("IDID")));
    }

    public static int[] diStringMatch(String S) {
        int size = S.length();
        int high = size;
        int low = 0;

        int[] result = new int[size + 1];

        for (int i = 0; i < size; i++) {
            if (S.charAt(i) == 'I') {
                result[i] = low++;
            } else {
                result[i] = high--;
            }
        }
        result[size] = low;
        return result;
    }
}
