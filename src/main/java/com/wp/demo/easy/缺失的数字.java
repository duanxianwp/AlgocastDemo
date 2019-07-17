package com.wp.demo.easy;

/**
 * @author wp
 * @date 2019/7/11
 */
public class 缺失的数字 {

    public static void main(String[] args) {

        int[] input  = new int[]{0,1,3,4};
        System.out.println(missingNumber(input));
    }

    // Time: O(n), Space: O(1)
    private static int missingNumber(int[] nums) {

        int n = nums.length, result = n;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ i ^nums[i];
        }
        return result;
    }
}
