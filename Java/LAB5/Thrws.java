//usage of throws 

import java.io.File;
import java.io.IOException;

public class Thrws {
    public static void main(String args) throws IOException {

        File f = new File("random.txt");
        System.out.println(f.getName());
    }

}
