package com.company;

//1323. Maximum 69 Number
public class Maximum69Number {

    public static void main(String[] args) throws Exception {
        System.out.println(maximum69Number(69));
    }

    public static int maximum69Number(int num) {
        int number = num;
        int step = 1;
        int offsetValue = 0;

        while (number != 0) {
            int digit = number % 10;
            number /= 10;
            if (digit == 6) {
                offsetValue = step * 3;
            }
            step *= 10;
        }
        return num + offsetValue;
    }
}
