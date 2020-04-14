package com.company;

//1295. Find Numbers with Even Number of Digits [Easy]
public class FindNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) throws Exception {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumberOfDigits(nums));

    }

    public static int findNumberOfDigits(int[] nums) {
        int countEvenDigits = 0;

        for (int i = 0; i < nums.length; i++) {
            int digitCount = checkEvenDigits(nums[i]);
            if (digitCount % 2 == 0){
                countEvenDigits++;
            }
        }
        return countEvenDigits;
    }

    public static int checkEvenDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
