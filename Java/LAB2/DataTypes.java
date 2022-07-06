// Datatypes and operators and Expressions

class DataTypesDt {

    public static void main(String args[]) {
        byte a = 10;
        short b = 12;
        int c = 24324;
        char d = 'c';
        String e = "THis is String";
        boolean f = true;
        boolean x = false;
        double g = 23.242452;

        double sum = g + c;
        System.out.println("Sum of " + g + " " + c + " = " + sum);
        if ((f == true) && (x == false)) {
            System.out.println("TRUE");
        }

        System.out.println(" Byte var= " + a + "\n Short var = " + b + "\n Int var= " + c + "\n Character var = " + d
                + "\n String var = " + e + "\n bool var= " + f + "\n double var = " + g);

    }

}
