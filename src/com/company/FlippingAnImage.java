package com.company;

import java.util.Arrays;

public class FlippingAnImage {

    public static void main(String[] args) throws Exception {
        int[][] points = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(Arrays.deepToString(points));
        System.out.println(Arrays.deepToString(flipAndInvertImage(points)));
    }

    public static int[][] flipAndInvertImage(int[][] A) {

        for (int i = 0; i < A.length; i++) {
            int[] pixels = A[i];

            for (int j = 0; j < pixels.length / 2; j++) {
                int temp = pixels[j];
                pixels[j] = pixels[pixels.length - j - 1];
                pixels[pixels.length - j - 1] = temp;
            }
            for (int x = 0; x < pixels.length; x++) {
                pixels[x] = pixels[x] == 0 ? 1 : 0;
            }
        }
        return A;
    }
}
