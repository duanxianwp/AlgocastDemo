package com.wp.demo.medium;

public class 回文子串个数 {

    public static void main(String[] args) {
        String s = "123";
        System.out.println(countPalindromicSubstringsDP(s));
        System.out.println(countPalindromicSubstringsExpand(s));
    }

    // Time: O(n^2), Space: O(n^2)
    private static int countPalindromicSubstringsDP(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int count = 0;
        boolean[][] record = new boolean[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (i == j) {
                    record[i][j] = true;
                } else if (i + 1 == j) {
                    record[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    record[i][j] = s.charAt(i) == s.charAt(j) && record[i + 1][j - 1];
                }
                if (record[i][j]) {
                    ++count;
                }
            }
        }
        return count;
    }


    private static int expand(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            ++count;
            --left;
            ++right;
        }
        return count;
    }

    // Time: O(n^2), Space: O(1)
    private static int countPalindromicSubstringsExpand(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += expand(s, i, i);
            count += expand(s, i, i + 1);
        }
        return count;
    }
}
