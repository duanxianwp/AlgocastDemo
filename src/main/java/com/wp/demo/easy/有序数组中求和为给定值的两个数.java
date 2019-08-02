package com.wp.demo.easy;

import java.util.Arrays;

/**
 * @author wp
 * @date 2019/7/2
 */
public class 有序数组中求和为给定值的两个数 {

    public static void main(String[] args) {

        int[] input = new int[]{1, 2, 3, 6, 8, 11};
        int target = 10;
        System.out.println(Arrays.toString(getTwoNumSumToGivenValue(input, target)));
    }
    // Time: O(n), Space: O(1)
    private static int[] getTwoNumSumToGivenValue(int[] input, int target) {

        int i = 0, j = input.length - 1;
        while (i < j) {
            if (input[i] + input[j] > target) {
                j--;
            } else if (input[i] + input[j] < target) {
                i++;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }
        return new int[]{-1, -1};
    }
}
