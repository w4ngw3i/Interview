package com.wangwei.javase;

import java.time.LocalDate;

/**
 * @auther wangwei
 * @date 2019-05-18 17:30
 */
public class LocalDateDemo2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate date1 = date.plusDays(1);
        System.out.println(date1);

        System.out.println(date);

        String str = "wangwei";
        System.out.println(str);

        String s = str.toUpperCase();
        System.out.println(s);

        System.out.println(str);
    }
}
