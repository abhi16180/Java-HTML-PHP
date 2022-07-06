public class BubbleSort {

    public static void main(String args[]) {
        int size = Integer.parseInt(args[0]);
        int[] arr = new int[size];
        int i, j;
        // to assign values to array
        for (i = 1; i <= size; i++)
            arr[i - 1] = Integer.parseInt(args[i]);

        // bubble sort logic
        for (i = 0; i < size - 1; i++) {
            for (j = 0; j < size - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (i = 0; i < size; i++)
            System.out.println(arr[i]);

    }
}
