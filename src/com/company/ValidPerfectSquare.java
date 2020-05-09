package com.company;

public class ValidPerfectSquare {

    public static void main(String[] args) throws Exception {
        System.out.println(isPerfectSquare(16));
    }

    public static boolean isPerfectSquare(int num) {

        //Math Function
        //return Math.sqrt(num) % 1 == 0;

        //Custom Made function
        return squareRoot(num) % 1 == 0;
    }

    public static double squareRoot(int number) {
        double temp;

        double sr = number / 2;
        do {
            temp = sr;
            sr = (temp + (number / temp)) / 2;
        } while ((temp - sr) != 0);

        return sr;
    }
}
