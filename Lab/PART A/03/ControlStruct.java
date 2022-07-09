//Usage of while,do while,switch,break and continue

import java.util.Scanner;

class ControlStruct {

        public static void main(String args[])

        {
                boolean choice = false;
                System.out.println("Enter the number");
                Scanner s = new Scanner(System.in);
                int number = s.nextInt();
                while (number != 0)
                        System.out.println(number--);

                do {
                        System.out.println("Enter a number");

                        int n = s.nextInt();
                        switch (n % 2) {
                                case 0:
                                        System.out.println(n + " X " + n + " = " + n * n);
                                        break;
                                case 1:
                                        System.out.println(2 + " X  " + n + " =  " + 2 * n);
                                        break;
                        }
                        System.out.println("Do you want to continue?");
                        Scanner sc = new Scanner(System.in);
                        choice = sc.nextBoolean();
                } while (choice == true);

                for (int i = 0; i < 10; i++) {
                        if (i % 2 == 0) {
                                continue;
                        } else {

                                System.out.println(i);
                        }
                }

        }

}
