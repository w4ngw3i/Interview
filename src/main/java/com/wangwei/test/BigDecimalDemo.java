package com.wangwei.test;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal countShowYi = BigDecimal.valueOf(Double.valueOf(0.06)).multiply(BigDecimal.valueOf(Double.valueOf(10010.00))).multiply(BigDecimal.valueOf(Double.valueOf(6)));
        countShowYi = countShowYi.divide(BigDecimal.valueOf(Double.valueOf(36500)), 2, BigDecimal.ROUND_FLOOR);
        countShowYi = countShowYi.setScale(2, BigDecimal.ROUND_FLOOR);
        System.out.println(countShowYi);

    }
}
