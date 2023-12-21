package ch9;

import java.math.BigDecimal;

public class BigDecimalTest01 {
    public static void main(String[] args) {
        new BigDecimal("123.45"); // 12345 * 10^(-2)

        BigDecimal bigDecimal1 = new BigDecimal(0.1);
        BigDecimal bigDecimal2 = new BigDecimal("0.1");
        System.out.println("bigDecimal1.equals(bigDecimal2) = " + bigDecimal1.equals(bigDecimal2));
        // false다  BigDecimal bigDecimal1 = new BigDecimal(0.1); => 0.1000000000000055....
    }
}
