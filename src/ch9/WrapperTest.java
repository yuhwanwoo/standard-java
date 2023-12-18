package ch9;

public class WrapperTest {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println("i1==i2 = " + (i1 == i2)); // false
        int i = Integer.parseInt("1");

        /*
        컴파일러가
        기본형을 래퍼 클래스로 자동 변환해주는 것을 오토박싱
        반대로 변환하는 것을 '언박싱'이라 한다.
         */
    }
}
