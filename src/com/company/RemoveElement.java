package com.company;

import java.util.Arrays;

public class RemoveElement {


    public static void main(String[] args) throws Exception {
        int[] arr = {3, 2, 2, 3};
        System.out.println(removeElement(arr, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i : nums) {
            if (i != val) {
                nums[count++] = i;
            }
        }
        return count;
    }
}
