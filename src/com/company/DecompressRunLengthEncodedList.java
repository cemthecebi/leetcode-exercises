package com.company;

import java.util.ArrayList;

//1313. Decompress Run-Length Encoded List
public class DecompressRunLengthEncodedList {

    public static void main(String[] args) throws Exception {
        int[] nums = {1,2,3,4};
        System.out.println(decompressRLEList(nums));
    }
    public static int[] decompressRLEList(int[] nums) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int y = 0; i < nums[i]; i++) {
                newList.add(nums[i++]);
            }
        }
         return newList.stream().mapToInt(i -> i).toArray();
    }
}
