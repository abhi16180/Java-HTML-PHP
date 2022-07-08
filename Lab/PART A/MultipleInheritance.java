//Try to implement the concept of multiple inheritance in Java with the use of interface

import java.util.Scanner;

interface A {

    public int getSquare(int a);
}

interface B {

    public int getCube(int b);
}

public class MultipleInheritance implements A, B {

    public int getSquare(int n) {

        return n * n;
    }

    public int getCube(int n) {
        return n * n * n;
    }

    public static void main(String args[]) {

        MultipleInheritance obj = new MultipleInheritance();
        System.out.println("Enter number");
        Scanner s = new Scanner(System.in);
        System.out.println("Square of the number is " + obj.getSquare(s.nextInt()));
        System.out.println("Enter number");
        System.out.println("Cube of the number is " + obj.getCube(s.nextInt()));
    }
}
