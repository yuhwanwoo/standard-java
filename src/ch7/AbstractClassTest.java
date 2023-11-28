package ch7;

public class AbstractClassTest extends Player {
    @Override
    void play() {
        super.play();
    }

    @Override
    void play(int pos) {

    }

    @Override
    void stop() {

    }
}

abstract class Player {
    boolean pause;
    int currentPos;

    public Player() {
        pause = false;
        currentPos = 0;
    }

    abstract void play(int pos);

    abstract void stop();

    void play() {
        play(currentPos);
    }

    void pause() {
        if (pause) {
            pause = false;
            play(currentPos);
        } else {
            pause = true;
            stop();
        }
    }
}