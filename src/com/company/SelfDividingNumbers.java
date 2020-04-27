package com.company;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {


    public static void main(String[] args) throws Exception {

        System.out.println(selfDividingNumbers(1, 22));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int number = left; number < right + 1; number++) {
            char[] chars = ("" + number).toCharArray();
            int notSelf = 0;
            for (int j = 0; j < chars.length; j++) {
                if (String.valueOf(chars).contains("0") || number % Character.getNumericValue(chars[j]) != 0) {
                    notSelf++;
                }
            }
            if (notSelf == 0) {
                result.add(number);
            }
        }
        return result;
    }
}
