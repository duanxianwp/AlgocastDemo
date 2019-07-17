package com.wp.demo.easy;

/**
 * @author wp
 * @date 2019/7/17
 */
public class 连续子序列的最大和 {

    public static void main(String[] args) {

        int[] nums = new int[]{2, -8, 3, -2, 4, -10};
        System.out.println(maxSumOfSubArray(nums));
    }

    // Time: O(n), Space: O(1)
    private static int maxSumOfSubArray(int[] nums) {

        int max = Integer.MIN_VALUE, cur = 0;
        for (int i = 0; i < nums.length; i++) {
            cur = cur <= 0 ? nums[i] : cur + nums[i];
            max = Math.max(max, cur);
        }
        return max;
    }
}
