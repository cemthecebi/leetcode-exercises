package com.company;

import java.util.Arrays;

public class SquaresOfASortedArray {

    public static void main(String[] args) throws Exception {

        int[] A = {-5, -3, 2, 4};
        System.out.println(Arrays.toString(sortedSquares(A)));

    }

    public static int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] *= A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
