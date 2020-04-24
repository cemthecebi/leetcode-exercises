package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class FindNUniqueIntegersSumUpToZero {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(sumZero(6)));
    }

    public static int[] sumZero(int n) {
        ArrayList<Integer> newList = new ArrayList<>();
        if (n == 0) {
            newList.add(0);
        } else {
            for (int i = 1; i < n / 2 + 1; i++) {
                newList.add(i);
                newList.add(i * -1);
            }
            if (n % 2 == 1) {
                newList.add(0);
            }
        }
        return newList.stream().mapToInt(i -> i).toArray();
    }
}
