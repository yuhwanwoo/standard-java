package ch7;

public class InnerClassTest {
    class InstanceInner {
        int iv = 100;
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 300;
    }

    void myMethod() {
        class LocalInner {
            int iv = 400;
        }
    }
}

class InnerEx4 {
    public static void main(String[] args) {
        InnerClassTest oc = new InnerClassTest();
        InnerClassTest.InstanceInner ii = oc.new InstanceInner();

        System.out.println("ii.iv = " + ii.iv);
        System.out.println("InnerClassTest.StaticInner.cv = " + InnerClassTest.StaticInner.cv);

        InnerClassTest.StaticInner si = new InnerClassTest.StaticInner();
        System.out.println("si.iv = " + si.iv);
    }
}
