//prog to show final class cannot be inherited

final class A {

    int a = 10;

}

class FinalClass extends A

{

    public static void main() {

        System.out.println("inside main");
    }

}
