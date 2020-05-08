package com.company;

public class CheckIfItIsAStraightLine {

    public static void main(String[] args) throws Exception {
        int[][] points = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};

        System.out.println(checkStraightLine(points));
    }

    public static boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0];
        int x2 = coordinates[1][0];

        int y1 = coordinates[0][1];
        int y2 = coordinates[1][1];

        for (int i = 2; i < coordinates.length - 1; i++) {

            int xi = coordinates[i][0];
            int yi = coordinates[i][1];

            int k1 = (y2 - y1) * (xi - x1);
            int k2 = (yi - y1) * (x2 - x1);

            if (k1 != k2) {
                return false;
            }
        }
        return true;
    }
}
