package com.wp.demo.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wp
 * @date 2019/7/18
 */
public class 数组中超过一半的数字 {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 3, 3, 3, 1, 1, 1, 4, 3};
        System.out.println(getMajority(nums));
    }

    // Time: O(n), Space: O(n)
    private static int getMajorityWithHashMap(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 0, maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            Integer val = map.getOrDefault(nums[i], 0) + 1;
            map.put(nums[i], val);
            if (val > maxCount) {
                maxCount = val;
                maxNum = nums[i];
            }
        }
        return maxNum;
    }

    // Time: O(n), Space: O(1) 摩尔投票
    private static int getMajority(int[] nums) {

        int num = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                num = nums[i];
                count = 1;
            } else if (num != nums[i]) {
                count--;
            } else {
                count++;
            }
        }
        return num;
    }
}
