package ch7;

interface InterfaceTest1 {
    void move(int x, int y);

    void attack(String s);
}

abstract class Fighter implements InterfaceTest1 {
    // 만약 인터페이 메서드의 일부만 구현한다면 abstract 클래스여야 한다.
    @Override
    public void move(int x, int y) { // 오버라이딩 시에 조상의 메서드 보다 넓은 범위의 접근 제어자를 설정해야 한다.

    }
}
