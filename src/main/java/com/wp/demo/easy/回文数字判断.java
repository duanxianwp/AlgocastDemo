package com.wp.demo.easy;

/**
 * @author wp
 * @date 2019/7/11
 */
public class 回文数字判断 {

    public static void main(String[] args) {

        int x = 123321;
        System.out.println(isPalindrome(x));
    }


    // Time: O(m), Space: O(1)
    private static boolean isPalindromeString(int x) {

        String input = String.valueOf(x);
        int i = 0, j = input.length() - 1;

//        /**
//         * one solution
//         */
//        while (i < j && input.charAt(i) == input.charAt(j)) {
//            i++;
//            j--;
//        }
//        return i == j || input.charAt(i) == input.charAt(j);
        while (i < j) {
            if (input.charAt(i) != input.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // Time: O(m), Space: O(1)
    private static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }
//        /**
//         * one solution
//         */
//        String input = String.valueOf(x);
//        int res = 0;
//        for (int i = input.length() - 1; i >= 0; i--) {
//            res = res * 10 + input.charAt(i) - '0';
//        }
//        return res == x;
        int tmp = x;
        long y = 0;
        while (tmp != 0) {
            y = y * 10 + tmp % 10;
            tmp /= 10;
        }
        return x == y;
    }
}
