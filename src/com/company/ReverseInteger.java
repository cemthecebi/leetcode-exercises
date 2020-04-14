package com.company;

//7. Reverse Integer
public class ReverseInteger {

    public static void main(String[] args) throws Exception {
        System.out.println(reverseInteger(1234));
    }

    public static int reverseInteger(int x) {
        if (x <= Integer.MIN_VALUE) return 0;
        long result = 0;
        long number = Math.abs(x);

        while (number != 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }

        if(result > Integer.MAX_VALUE) return 0;
        else {
            int intResult = (int) result;
            if(x>0){
                return intResult;
            }else {
                return -intResult;
            }
        }
    }
}
