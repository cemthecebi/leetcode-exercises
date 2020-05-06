package com.company;

import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) throws Exception {
        int[] nums = {-1,1,1,1,2,1};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int count = map.get(nums[i]) + 1;
                map.put(nums[i], count);
                if (count > nums.length / 2) {
                    return nums[i];
                }
            } else {
                map.put(nums[i], 1);
            }
        }
        return -1;
    }
}
