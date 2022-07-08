// Write a Java program to facilitate the multilevel inheritance.
// (Also demonstrate the use of  constructor in multilevel inheritance)
class A {

    int a = 10;

    A() {
        System.out.println("Inside class A constructor");
    }
}

class B extends A {
    int b = 20;

    B() {
        System.out.println("Inside class B constructor");
    }
}

/**
 * Mlevelinheritance
 */
 class Mlevelinheritance extends B {
    public static void main(String args[]) {
        Mlevelinheritance obj = new Mlevelinheritance();
        System.out.println(obj.a + obj.b);
    }

}
