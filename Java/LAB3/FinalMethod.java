// prog to show Cannot override the final method from 

class A {

    final void eg() {

        System.out.println("Inside A");
    }

}

class FinalMethod extends A {

    void eg() {
        System.out.println("INSIDE FinalMethod");

    }

    public static void main(String args[]) {
        FinalMethod f = new FinalMethod();
        f.eg();

    }

}