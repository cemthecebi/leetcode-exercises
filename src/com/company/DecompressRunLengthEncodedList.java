package com.company;

import java.util.ArrayList;
import java.util.Arrays;

//1313. Decompress Run-Length Encoded List [Easy]
public class DecompressRunLengthEncodedList {

    public static void main(String[] args) throws Exception {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(decompressRLEList(nums)));
    }
    public static int[] decompressRLEList(int[] nums) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < nums.length; i+=2) {
            int freq = nums[i];
            int value = nums[i+1];
            while(freq>0){
                newList.add(value);
                freq--;
            }
        }
        return newList.stream().mapToInt(i -> i).toArray();
    }
}
