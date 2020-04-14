package com.company;

import java.util.ArrayList;

//1365. How Many Numbers Are Smaller Than the Current Number [Easy]
public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public static void main(String[] args) throws Exception {
        int[] nums = {8, 1, 2, 2, 3};
        int[] smallerOnes = calculateSmallerOnes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(smallerOnes[i]);
        }
    }

    public static int[] calculateSmallerOnes(int[] nums) {
        int[] newResult = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int countBiggerOnes = 0;
            for (int j = 0; j < nums.length; j++) {
                if (num != nums[j] && num > nums[j]) {
                    countBiggerOnes++;
                }
            }
            for (int j = 0; j < newResult.length; j++) {
                newResult[i] = countBiggerOnes;
            }
        }
        return newResult;
    }
}


