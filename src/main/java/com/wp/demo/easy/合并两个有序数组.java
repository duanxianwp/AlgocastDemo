package com.wp.demo.easy;

import java.util.Arrays;

/**
 * @author wp
 * @date 2019/7/17
 */
public class 合并两个有序数组 {

    public static void main(String[] args) {
        int[] nums1 = new int[7];
        nums1[0] = 3;
        nums1[1] = 4;
        nums1[2] = 5;
        nums1[3] = 6;
        int[] nums2 = new int[3];
        nums2[0] = 0;
        nums2[1] = 1;
        nums2[2] = 2;

        mergeTwoSortedArray(nums1,4,nums2,3);
        System.out.println(Arrays.toString(nums1));
     }

    // Time: O(m+n), Space: O(1)
    private static void mergeTwoSortedArray(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1, j = n - 1, k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
