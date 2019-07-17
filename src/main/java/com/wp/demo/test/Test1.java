package com.wp.demo.test;

import org.springframework.util.StringUtils;

/**
 * @author wp
 * @date 2019/7/9
 */
public class Test1 {

    public static void main(String[] args) {

        System.out.println(sex("130304198804018650"));
    }

    private static String sex(String identificationNo) {
        if (!StringUtils.isEmpty(identificationNo)) {
            //获取性别
            if (Integer.parseInt(identificationNo.substring(identificationNo.length() - 2, identificationNo.length() - 1)) % 2 == 1) {
                return "男";
            } else {
                return "女";
            }
        }
        return "";
    }
}
