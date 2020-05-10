package com.company;

public class FindTheTownJudge {
    public static void main(String[] args) throws Exception {
        int[][] points = {{1, 2}, {2, 3}};
        int[][] point2 = {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
        int[][] point3 = {{1, 3}, {2, 3}, {3, 1}};
        int[][] point4 = {};

        System.out.println(findJudge(1, point4));
    }

    public static int findJudge(int N, int[][] trust) {
        if (trust.length == 0) return N;
        int[] result = new int[N + 1];
        for (int i = 0; i < trust.length; i++) {
            result[trust[i][1]]++;
            result[trust[i][0]]--;
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] == (N - 1)) {
                return i;
            }
        }
        return -1;
    }
}
