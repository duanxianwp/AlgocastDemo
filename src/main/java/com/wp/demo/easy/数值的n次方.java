package com.wp.demo.easy;

/**
 * @author wp
 * @date 2019/7/6
 */
public class 数值的n次方 {

    public static void main(String[] args) {

        double x = 2;
        int n = -3;
        System.out.println(powFast(x, n));

    }

    //T:O(n) S:O(1)
    private static double pow(double x, int n) {

        double result = 1;
        long N = Math.abs((long) n);

        for (int i = 0; i < N; i++) {
            result *= x;
        }
        return n < 0 ? 1 / result : result;
    }

    private static double powFast(double x, int n) {
        double result = 1;
        long N = Math.abs((long) n);

        while (N != 0) {
            if ((N & 1) == 1) {
                result *= x;
            }
            x *= x;
            N = N >> 1;
        }
        return n < 0 ? 1 / result : result;
    }
}
