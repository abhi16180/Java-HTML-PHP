class ExcpWithOverloading {

    double divide(int x) {
        return x / 0;

    }

    double divide(int x, int y)

    {

        return x / y;

    }

    double divide(int x, int y, int z) {

        return x / y / z;
    }

    public static void main(String args[]) {

        ExcpWithOverloading o = new ExcpWithOverloading();
        try {
            System.out.println(o.divide(34, 4, 4));
            System.out.println(o.divide(4, 43));
            System.out.println(o.divide(4));

        } catch (ArithmeticException e) {

            System.out.println(e);
        }

    }
}
