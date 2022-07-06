//prog to show final var cannot be reassigned 

class FinalVar {

    final int a = 10;

    void test() {
        this.a = 324;
    }

    public static void main(String args[])

    {

        FinalVar obj = new FinalVar();

        obj.test();

    }

}
