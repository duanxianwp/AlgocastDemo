package com.wp.demo.easy;

/**
 * @author wp
 * @date 2019/7/1
 */
public class 回文字符串判断 {
    public static void main(String[] args) {

        String input = " race a E-car ";
        System.out.println(isPalindrome(input));
        input = " race a car ";
        System.out.println(isPalindrome(input));
    }
    // Time: O(n), Space: O(1)
    private static boolean isPalindrome(String input) {
        if (input == null || input.length() == 0) {
            return true;
        }
        int i = 0, j = input.length() - 1;
        for (; i < j; i++, j--) {
            while (i < j && !isAlphanumeric(input.charAt(i))) {
                i++;
            }
            while (i < j && !isAlphanumeric(input.charAt(j))) {
                j--;
            }
            if (i < j && !isEqualIgnoreCase(input.charAt(i), input.charAt(j))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isAlphanumeric(char a) {
        return (a >= '0' && a <= '9') || (a >= 'A' && a <= 'Z') || (a >= 'a' && a <= 'z');
    }

    private static boolean isEqualIgnoreCase(char a, char b) {
        if (a >= 'A' && a <= 'Z') {
            a += 32;
        }
        if (b >= 'A' && b <= 'Z') {
            b += 32;
        }
        return a == b;
    }
}
