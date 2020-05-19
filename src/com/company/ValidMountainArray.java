package com.company;

public class ValidMountainArray {

    public static void main(String[] args) throws Exception {
        int[] arr = {1,2,3,4,5,4,3,2,1};
        System.out.println(validMountainArray(arr));
    }

    public static boolean validMountainArray(int[] A) {
        if (A.length == 0 || A.length == 1 || A[0] > A[1]) {
            return false;
        }
        int changeCount = 1;
        boolean increase = true;

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                if (changeCount == 1) {
                    increase = false;
                    changeCount--;
                }
            } else {
                increase = true;
            }
            if (increase && changeCount == 0 && A[i] < A[i + 1]) {
                return false;
            }
        }
        return !increase;
    }
}
