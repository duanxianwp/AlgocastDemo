package com.wp.demo.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wp
 * @date 2019/7/1
 */
public class 求和为给定值的两个数 {

    public static void main(String[] args) {

        int[] input = new int[]{1, 2, 3, 6, 8, 11};
        System.out.println(Arrays.toString(getTwoNumSumToGivenValueHashMap(input, 10)));
    }
    // Time: O(n), Space: O(n)
    private static int[] getTwoNumSumToGivenValueHashMap(int[] intput, int target) {

        Map<Integer, Integer> resMap = new HashMap<>();
        for (int i = 0; i < intput.length; i++) {
            Integer val = target - intput[i];
            if (resMap.containsKey(val)) {
                return new int[]{resMap.get(val),i};
            }
            resMap.put(intput[i],i);
        }
        return new int[]{-1, -1};
    }


}
