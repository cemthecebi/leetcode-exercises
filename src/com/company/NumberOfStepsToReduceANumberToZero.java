package com.company;

//1342. Number of Steps to Reduce a Number to Zero [Easy]
public class NumberOfStepsToReduceANumberToZero {

    public static void main(String[] args) throws Exception {
        System.out.println(calculateNumberOfSteps(1234));
    }

    public static int calculateNumberOfSteps(int num) {
        int i = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
                i++;
            } else {
                num = num - 1;
                i++;
            }
        }
        return i;
    }
}

