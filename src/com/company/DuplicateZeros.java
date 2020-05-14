package com.company;

import java.util.Arrays;

public class DuplicateZeros {

    public static void main(String[] args) throws Exception {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
    }


    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 2; j >= i; j--) {
                    arr[j + 1] = arr[j];
                }
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
