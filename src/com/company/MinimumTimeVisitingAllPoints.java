package com.company;

//1266. Minimum Time Visiting All Points
public class MinimumTimeVisitingAllPoints {

    public static void main(String[] args) throws Exception {
        int[][] points = {{1, 1}, {3, 4}, {-1, 0}};

        System.out.println(minTimeToVisitAllPoints(points));
    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int secondsCount = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int calculateDiffForX = Math.abs(points[i + 1][0] - points[i][0]);
            int calculateDiffForY = Math.abs(points[i + 1][1] - points[i][1]);

            if (calculateDiffForX > calculateDiffForY) {
                secondsCount += calculateDiffForX;
            } else {
                secondsCount += calculateDiffForY;
            }
        }
        return secondsCount;
    }
}
