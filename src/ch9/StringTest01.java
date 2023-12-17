package ch9;

public class StringTest01 {
    public static void main(String[] args) {
        // JVM 내의 상수 저장소에 저장된다.
        String a = "a";
        String b = "a";

        System.out.println("a==b = " + (a == b)); // true

        String c = new String("a");
        String d = new String("a");

        System.out.println("(c == d) = " + (c == d)); // false

        char[] cArr = new char[0];
        String s = new String(cArr);

        System.out.println("s = " + s); //new String("");

        int parseInt1 = Integer.parseInt("-" + 100);
        int parseInt2 = Integer.parseInt("+" + 100);

        System.out.println("parseInt1 = " + parseInt1);
        System.out.println("parseInt2 = " + parseInt2);
    }
}
