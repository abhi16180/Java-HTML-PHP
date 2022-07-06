//Sort list of string

import java.util.*;
import java.io.*;

class Test {
    int len, i, j;
    String arr[];

    Test(int n) {
        len = n;
        arr = new String[n];
    }

    String[] getArray() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the strings U want to sort----");
        for (int i = 0; i < len; i++) {
            arr[i] = br.readLine();
        }
        return arr;
    }

    String[] check() throws ArrayIndexOutOfBoundsException {
        for (i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if ((arr[i].compareTo(arr[j])) > 0) {
                    String s1 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = s1;
                }
            }
        }
        return arr;
    }

    void display() throws ArrayIndexOutOfBoundsException {
        System.out.println("Sorted list is---");
        for (i = 0; i < len; i++)
            System.out.println(arr[i]);
    }
} // end of the Test class

class SortStringArray {
    public static void main(String args[]) throws IOException {
        Test obj1 = new Test(4);
        obj1.getArray();
        obj1.check();
        obj1.display();
    }
}
