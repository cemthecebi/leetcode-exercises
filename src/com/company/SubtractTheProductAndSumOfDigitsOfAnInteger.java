package com.company;

//1281. Subtract the Product and Sum of Digits of an Integer
public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public static void main(String[] args) throws Exception {
        System.out.println(subtractProductAndSum(1234));
    }

    public static int subtractProductAndSum(int num) {
        int sum = sumDigits(num);
        int product = productDigits(num);
        return product - sum;
    }

    public static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static int productDigits(int num) {
        int sum = 1;
        while (num > 0) {
            sum = sum * (num % 10);
            num = num / 10;
        }
        return sum;
    }
}
