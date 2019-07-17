package com.wp.demo.easy;

import java.util.Arrays;

/**
 * @author wp
 * @date 2019/7/4
 */
public class 行列递增的二维数组搜索 {

    public static void main(String[] args) {

        int[][] input = new int[][]{{1, 3, 5}, {2, 4, 6}};
        int target = 4;
        System.out.println(Arrays.toString(searchIn2DArray(input, target)));
    }

    private static int[] searchIn2DArray(int[][] input, int target) {

        if (input.length == 0 || input == null || input[0] == null || input[0].length == 0) {
            return new int[]{-1, -1};
        }
        int i = 0, j = input[0].length - 1;
        while (i <= j && j >= 0) {
            if (input[i][j] > target) {
                j--;
            } else if (input[i][j] < target) {
                i++;
            } else {
                return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }
}
