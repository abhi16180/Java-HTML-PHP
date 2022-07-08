// All types of exception

import java.util.Scanner;

class Try

{

    void arithmetic() {
        try {
            int a = 10 / 0;
            int b = a;
        } catch (ArithmeticException err) {

            throw err;
        }
    }

    void arrayIndex() {
        int arr[] = new int[10];
        try {
            arr[20] = 30;
        } catch (ArrayIndexOutOfBoundsException err) {

            System.out.println("Array index out of bounds exception");
        }
    }

    void nullPointer() {

        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException err)

        {

            System.out.println("Null pointer exception");
        }
    }

    void stringIndex() {

        try {
            String s = "as";
            System.out.println(s.charAt(8));
        } catch (StringIndexOutOfBoundsException err) {
            System.out.println("String index out of bound");

        }
    }

    void numberFormat() {
        String a = "123d";
        try {

            int x = Integer.parseInt(a);

        } catch (NumberFormatException er) {
            throw er;

        }
    }

    public static void main(String args[]) {

        Try o = new Try();
        System.out.println("Enter 1.aritmatic excep\n2.Array index\n3.nullPointer \n4.string index\n5.number format");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        switch (choice)

        {
            case 1:
                o.arithmetic();
                break;
            case 2:
                o.arrayIndex();
                break;
            case 3:
                o.nullPointer();
                break;
            case 4:
                o.stringIndex();
                break;
            case 5:
                o.numberFormat();
                break;
            default:
                System.out.println("ERROR");

        }
    }
}
