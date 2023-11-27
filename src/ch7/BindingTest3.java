package ch7;

public class BindingTest3 {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();
        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println("==============");
        System.out.println("c.x = " + c.x);
        c.method();
        /*
        p.x = 100
        x = 200
        super.x = 100
        this.x = 200
        ==============
        c.x = 200
        x = 200
        super.x = 100
        this.x = 200
         */
    }
}

class Parent {
    int x = 100;
    void method() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    int x = 200;

    void method() {
        System.out.println("x = " + x);
        System.out.println("super.x = " + super.x);
        System.out.println("this.x = " + this.x);
    }
}
