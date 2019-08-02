package com.wp.demo.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wp
 * @date 2019/7/8
 */
public class 数组的全排列 {

    public static void main(String[] args) {

        int[] input = new int[]{1,2,3};
        permute(input);
    }

    private static void permuteRec(List<Integer> nums, int start, List<List<Integer>> result) {

        if (start == nums.size()) {
            result.add(new ArrayList<>(nums));
        } else {

            for (int i = start; i < nums.size(); i++) {

                Collections.swap(nums, i, start);
                permuteRec(nums, start + 1, result);
                Collections.swap(nums, i, start);
            }
        }
    }


    private static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        permuteRec(list, 0, result);

        return result;
    }
}
