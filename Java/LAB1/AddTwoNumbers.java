
//program to add two numbers using scanner
import java.util.Scanner;

class AddTwoNumbers {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = s.nextInt();
        System.out.println("Enter the second number");
        int b = s.nextInt();
        int sum = a + b;
        System.out.println(sum);
        s.close();

    }

}
