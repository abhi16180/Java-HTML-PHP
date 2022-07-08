class A {

        void print(int a) {
                System.out.println(a * a);
        }

}

class B extends A

{

        void print(int a) {

                System.out.println(a * a * a);

        }

}

class Dispatch extends A {

        void print(int a) {
                System.out.println(a);

        }

        public static void main(String args[])

        {

                A a = new A();
                B b = new B();
                Dispatch c = new Dispatch();
                A obj;
                obj = a;
                a.print(10);
                obj = b;
                b.print(10);
                obj = c;
                c.print(10);

        }
}
