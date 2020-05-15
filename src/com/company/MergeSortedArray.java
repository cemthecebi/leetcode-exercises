package com.company;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) throws Exception {
        int[] arr = {1, 2, 3, 0, 0, 0};
        int[] arr1 = {2, 5, 6};

        merge(arr, 3, arr1, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        int index = nums1.length - 1;
        while (index >= 0) {
            if (m < 0) {
                nums1[index] = nums2[n--];
            } else if (n < 0) {
                nums1[index] = nums1[m--];
            } else {
                if (nums1[m] > nums2[n]) {
                    nums1[index] = nums1[m--];
                } else {
                    nums1[index] = nums2[n--];
                }
            }
            index--;
        }
    }
}
