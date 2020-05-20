package com.company;

public class MoveZeroes {

    public static void main(String[] args) throws Exception {
        int[] nums = {0, 3, 12, 21, 0};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
