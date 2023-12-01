package ch7;

public class InterfaceTest4 implements T41, T42{
    @Override
    public void play() {
        T41.super.play();
    }
}

interface T41 {
    default void play() {

    }
}

interface T42 {
    default void play() {

    }
}
