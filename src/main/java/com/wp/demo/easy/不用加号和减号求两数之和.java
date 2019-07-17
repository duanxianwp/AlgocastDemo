package com.wp.demo.easy;

/**
 * @author wp
 * @date 2019/7/3
 */
public class 不用加号和减号求两数之和 {
    public static void main(String[] args) {

        int a = 10, b = 2;
        System.out.println(getSumIterative(a, b));

    }

    private static int getSumRecursive(int a, int b) {
        return b == 0 ? a : getSumRecursive(a ^ b, (a & b) << 1);
    }

    private static int getSumIterative(int a, int b) {

        while (b != 0) {
            int sum = a ^ b;
            int carry = (a & b) << 1;
            a = sum;
            b = carry;
        }
        return a;
    }
}
