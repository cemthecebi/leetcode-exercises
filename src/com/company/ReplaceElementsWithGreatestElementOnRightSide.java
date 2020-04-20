package com.company;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {

    public static void main(String[] args) throws Exception {
        //int[] arr = {17, 18, 5, 4, 6, 1};
        int[] arr = {57010, 40840, 69871, 14425, 70605};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }


    public static int[] replaceElements(int[] arr) {
        int[] newList = new int[arr.length];

        for (int i = 0; i < arr.length-1; i++) {
            int maxValue = arr[i + 1];
            for (int j = i + 1; j < arr.length; j++) {
                if (maxValue < arr[j]) {
                    maxValue = arr[j];
                }
            }
            newList[i] = maxValue;
        }
        newList[arr.length - 1] = -1;
        return newList;
    }
}
