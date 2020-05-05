package com.company;

import java.util.ArrayList;

public class NumberComplement {

    public static void main(String[] args) throws Exception {
        System.out.println(findComplement(5));
    }

    public static int findComplement(int num) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (num > 0) {
            int reminder = num % 2;
            arrayList.add(reminder);
            num = num / 2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(1)) {
                arrayList.set(i, 0);
            } else {
                arrayList.set(i, 1);
            }
        }
        int result = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            result += (int) (arrayList.get(i) * Math.pow(2, i));
        }
        return result;
    }
}
