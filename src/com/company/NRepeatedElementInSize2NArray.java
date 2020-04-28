package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NRepeatedElementInSize2NArray {

    public static void main(String[] args) throws Exception {
        int[] points = {5, 1, 5, 2, 5, 3, 5, 4};
        System.out.println(repeatedNTimes(points));

    }

    public static int repeatedNTimes(int[] A) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            int value = 1;
            if (freq.get(A[i]) != null) {
                value = freq.get(A[i])+1;
            }
            freq.put(A[i], value);
        }
        System.out.println(freq);

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == A.length / 2) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
