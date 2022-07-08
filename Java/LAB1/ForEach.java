import java.util.Scanner;

class ForEach {

    public static void main(String args[]) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // displaying using for each loop
        System.out.println("Displaying using for each loop");
        for (int ele : arr) {
            System.out.println(ele);
        }
        sc.close();

    }
}