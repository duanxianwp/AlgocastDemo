package com.wp.demo.easy;

/**
 * @author wp
 * @date 2019/7/24
 */
public class 二分搜索 {

    public static void main(String[] args) {

        int[] nums = new int[]{0, 1, 3, 4, 5};
        System.out.println(binarySearch(nums, 2));
    }

    // Time: O(log(n)), Space: O(1)
    private static int binarySearch(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return -1;
        }
        int low = 0, high = nums.length - 1;

        while (low <= high) {

            /**
             * 可能后面low特别大，导致low+high 超出int最大值
             * 所以这个地方可以用int mid = low+(high-low)/2
             */

            int mid = (low + high) / 2;
            if (target < nums[mid]) {
                high = mid - 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
