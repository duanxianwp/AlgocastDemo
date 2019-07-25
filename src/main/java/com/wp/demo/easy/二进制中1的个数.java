package com.wp.demo.easy;

/**
 * @author wp
 * @date 2019/7/24
 */
public class 二进制中1的个数 {

    public static void main(String[] args) {

        System.out.println(numberOfOneWithMask(12));
        System.out.println(numberOfOne(12));

        int n = 12;
        StringBuilder stringBuilder = new StringBuilder();
        while (n != 0) {
            if ((n & 1) == 1){
                stringBuilder.append("1");
            }else {
                stringBuilder.append("0");
            }
            n >>= 1;
        }
        System.out.println(Integer.parseInt(stringBuilder.reverse().toString()));
    }

    // Time: O(m), Space: O(1)
    private static int numberOfOneWithMask(int n) {

        /*int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                ++count;
            }
            n >>= 1;
        }*/
        int mask = 1, count = 0;
        while (mask != 0) {
            if ((n & mask) != 0) {
                ++count;
            }
            mask <<= 1;
        }
        return count;
    }

    // Time: O(k), Space: O(1)
    private static int numberOfOne(int n) {

        int count = 0;

        while (n != 0) {

            ++count;
            n &= (n - 1);
        }
        return count;
    }


}
