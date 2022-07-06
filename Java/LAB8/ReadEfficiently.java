// Read file using filereader and disp,then use efficient method


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
 
public class ReadEfficiently {
 
    public static void main(String args[]) {
 
        // reading file using file reader
        String path = "test.txt";
        File f = new File(path);
        String line;
        try {
 
            // reading using file reader
            System.out.println("----Using FileReader----");
            FileReader fr = new FileReader(f);
            int fileContent;
            while ((fileContent = fr.read()) != -1) {
                System.out.print((char) fileContent);
            }
            fr.close();
 
            // reading using buffered reader
            // more efficient method
            System.out.println("\n----Using BufferedReader----");
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
