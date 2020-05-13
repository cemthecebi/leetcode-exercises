package com.company;

public class MaxConsecutiveOnes {

    public static void main(String[] args) throws Exception {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                maxCount = getBiggerCount(maxCount, count);
                count = 0;
            }
        }
        maxCount = getBiggerCount(maxCount, count);
        return maxCount;
    }

    private static int getBiggerCount(int maxCount, int count) {
        if (count > maxCount) {
            maxCount = count;
        }
        return maxCount;
    }
}
