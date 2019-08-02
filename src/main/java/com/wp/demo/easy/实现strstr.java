package com.wp.demo.easy;

/**
 * @author wp
 * @date 2019/7/30
 */
public class 实现strstr {

    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        System.out.println(strstr(haystack, needle));
    }

    // Time: O((n-m+1)*m), Space: O(1)
    private static int strstr(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }
        int n = haystack.length(), m = needle.length();
        for (int i = 0; i < n - m; i++) {

            int k = i,j = 0;
            for (;haystack.charAt(k) == needle.charAt(j);++k,++j );
            if (j == m){
                return i;
            }
        }
        return -1;


    }
}
