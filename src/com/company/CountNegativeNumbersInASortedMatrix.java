package com.company;

public class CountNegativeNumbersInASortedMatrix {

    public static void main(String[] args) throws Exception {
        int[][] points = {{1, -1}, {-1, -1}, {-1, 0}};
        System.out.println(countNegatives(points));
    }

    public static int countNegatives(int[][] grid) {
        int negativeCount = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    negativeCount++;
                }
            }
        }
        return negativeCount;
    }
}
