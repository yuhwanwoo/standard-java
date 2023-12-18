package ch9;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");

        StringBuffer sb2 = sb.append("ZZ");

        System.out.println("sb = " + sb);
        System.out.println("sb2 = " + sb2); // 같은 주

        StringBuffer sb3 = new StringBuffer("abc");
        StringBuffer sb4 = new StringBuffer("abc");

        System.out.println("(sb4==sb3) = " + (sb4 == sb3)); // false
        System.out.println("sb4.equals(sb3) = " + sb4.equals(sb3)); // false

        System.out.println("(sb4.toString().equals(sb3.toString())) = " + (sb4.toString().equals(sb3.toString()))); // true

    }
}
