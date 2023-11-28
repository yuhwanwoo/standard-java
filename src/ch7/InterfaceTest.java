package ch7;

interface InterfaceTest {

    /*
    아래 멤버 변수는 모두 public static final이다(생략해도 그렇다)
     */
    public static final int SPADE = 4;
    final int DIAMOND = 3;
    static int HEART = 2;
    int COLVER = 1;

    /*
    모든 메서드도 생략해도되지만 모두 public abstract 메소드이다.
     */

    public abstract String getCardNumber();

    String getChardKind();
}
