class NestedTry

{

    void test() {
        int a;
        try {
            a = 100 / 2;

            try {

                int b = a / 0;
            } catch (ArithmeticException err) {
                System.out.println("Divided by 0 err");

            }

        } catch (Exception err) {

            System.out.println("ERROR");

        }

    }

    public static void main(String args[])

    {

        NestedTry o = new NestedTry();
        o.test();

    }
}
