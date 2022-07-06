//usage of super keyword

class A {

        int a = 10;

        A() {
                System.out.println("Inside default constructor of A");
        }

        public void fun() {
                System.out.println("Inside class A");
        }
}

class A {

        int a = 10;

        A() {
                System.out.println("Inside default constructor of A");
        }

        public void fun() {
                System.out.println("Inside class A");
        }
}

class SuperKey extends A

{

        int a = 23;

        SuperKey() {
                super();
                System.out.println("Inside default constructor of class SuperKey");
        }

        public void fun() {
                super.fun();
                System.out.println("a=" + this.a + " super a =" + super.a);
                System.out.println("Inside function of class SuperKey");

        }

        public static void main(String args[]) {

                SuperKey s = new SuperKey();
                s.fun();

        }

}
