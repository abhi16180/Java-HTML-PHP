import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.lang.Exception;

public class ReadFile {
    public static void main(String args[]) throws Exception {
        // to get the file path the user input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name");
        String filePath = sc.next();
        // to open a file
        File f = new File(filePath);
        if (f.exists()) {

            // reading file using FileReader
            FileReader fr = new FileReader(f);
            int c;
            System.out.println("Displaying data using FileReader");
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }

            // reading file using FileInputStream
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            String s;
            System.out.println("\nDisplaying data using FileInputStream");
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }

            fr.close();
            br.close();
            sc.close();


        } else {
            System.out.println("File doesn't exist");
        }

    }
}
