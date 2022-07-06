
//hierarchical inheritance

class A {
    final String clg = "N.I.E";
    String name;

    A() {
        this.name = "Ram";
    }

    A(String name) {
        this.name = name;
    }

    void printData() {
        System.out.println(this.name + " from " + this.clg);
    }
}

// Derived from A
class B extends A {
    String name;

    B(String name) {
        super();
        this.name = name;
    }

    void printData() {
        super.printData();
        System.out.println(this.name + " from " + super.clg);
    }

}

// Derived from A
public class Hierarchical extends A {

    public static void main(String args[]) {

        Hierarchical obj = new Hierarchical();// calls constructor of class A
        obj.printData(); // calls function defined in class A
        B objB = new B("xyz"); // calls class A constructor then class B constructor
        objB.printData();
        // calls printData() of class B
        // super.printData() calls class A's printData() function
        // class A printData() will get executed
        // then remaining statements of printData() of class B will get executed

    }

}
