//HybridInheritance
class A {
    int b;
    int c;
}

interface B {
    public void assignB(int b);

}

interface C {
    public void assignC(int c);
}

public class HybridInheritance extends A implements B, C {

    public void assignB(int b) {
        super.b = b;

    }

    public void assignC(int c) {
        super.c = c;
    }

    void print() {
        System.out.println(super.b);
        System.out.println(super.c);
    }

    public static void main(String args[]) {
        HybridInheritance obj = new HybridInheritance();

        obj.assignB(10);
        obj.assignC(20);
        obj.print();
    }
}
