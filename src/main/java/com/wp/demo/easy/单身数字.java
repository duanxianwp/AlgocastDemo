package com.wp.demo.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wp
 * @date 2019/7/3
 */
public class 单身数字 {

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 2, 3, 3, 4, 4, 5, 5};
        System.out.println(singleNumberWithSet(input));
        System.out.println(singleNumberWithXOR(input));
    }

    //T:O(n) S:O(n)
    private static int singleNumberWithSet(int[] input) {
        Set<Integer> set = new HashSet<>();
        int uniqueSum = 0;
        int sum = 0;
        for (int num : input) {
            if (!set.contains(num)) {
                set.add(num);
                uniqueSum += num;
            }
            sum += num;
        }
        return 2 * uniqueSum - sum;
    }

    //T:O(n) S:O(1)
    private static int singleNumberWithXOR(int[] input) {
        int result = 0;
        for (int num : input) {
            result = result ^ num;
        }
        return result;
    }
}
