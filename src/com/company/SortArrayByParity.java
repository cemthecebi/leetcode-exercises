package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayByParity {

    public static void main(String[] args) throws Exception {
        int[] arr = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }

    public static int[] sortArrayByParity(int[] A) {
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                evenList.add(A[i]);
            } else {
                oddList.add(A[i]);
            }
        }
        evenList.addAll(oddList);
        return evenList.stream().mapToInt(i->i).toArray();
    }

}
