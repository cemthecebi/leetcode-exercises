package com.company;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix {

    public static void main(String[] args) throws Exception {
        int[][] mat = {{3, 7, 8},
                {9, 11, 13},
                {15, 16, 17},};
        System.out.println(luckyNumbers(mat));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] minr = new int[m];
        int[] maxc = new int[n];
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            minr[i] = matrix[i][0];
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < minr[i]) {
                    minr[i] = matrix[i][j];
                }
            }
        }
        for (int j = 0; j < n; j++) {
            maxc[j] = matrix[0][j];
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] > maxc[j]) {
                    maxc[j] = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (minr[i] == maxc[j]) {
                    resultList.add(minr[i]);
                }
            }
        }

        return resultList;
    }
}

