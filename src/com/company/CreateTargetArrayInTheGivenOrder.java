package com.company;

import java.util.ArrayList;
import java.util.Arrays;

//1389. Create Target Array in the Given Order
public class CreateTargetArrayInTheGivenOrder {

    public static void main(String[] args) throws Exception {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        int[] nums2 = {1, 2, 3, 4, 0};
        int[] index2 = {0, 1, 2, 3, 0};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
        System.out.println(Arrays.toString(createTargetArray(nums2, index2)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            newList.add(index[i], nums[i]);
        }
        return newList.stream().mapToInt(i -> i).toArray();
    }
}
