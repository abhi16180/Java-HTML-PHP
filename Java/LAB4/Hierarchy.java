class A {

    A() {
        System.out.println("Inside  class A constructor");
    }

    A(String s) {
        System.out.println(s);
    }

    void disp() {
        System.out.println("method inside class A");
    }

}

final class B extends A {
    B() {
        super("Hello , Matrix!");
        System.out.println(" class B constructor");
    }

    void disp() {
        System.out.println("disp() method overridden by class B method");
    }

}

final class C extends A {
    C() {
        super("Hi there");
        System.out.println("Inside class C constructor");
    }

    void disp() {
        System.out.println("disp() method overridden by class C method");
    }

}

class Hierarchy {
    public static void main(String args[]) {
        A objA = new A();
        B objB = new B();
        C objC = new C();
        objA.disp();
        objB.disp();
        objC.disp();
    }
}