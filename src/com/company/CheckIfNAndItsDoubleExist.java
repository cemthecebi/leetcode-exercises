package com.company;

public class CheckIfNAndItsDoubleExist {

    public static void main(String[] args) throws Exception {
        int[] arr = {-2, 0, 10, -19, 4, 6, -8};
        int[] arr1 = {0, 0};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j] * 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
