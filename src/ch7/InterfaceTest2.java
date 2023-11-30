package ch7;

public class InterfaceTest2 extends TV implements IVCR{
    @Override
    public void play() {

    }

    @Override
    public void stop() {

    }
}

class TV {
    protected boolean power;
    protected int channel;
    protected int volume;

    public void power() {
        power =! power;
    }

    public void channelUp() {
        channel++;
    }
}
interface IVCR {
    void play();

    void stop();
}

class VCR {
    protected int counter;

    public void play() {

    }

    public void reset() {

    }
}
