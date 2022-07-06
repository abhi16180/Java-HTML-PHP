 
import java.io.File;
import java.io.FileWriter;
public class WriteFile {
   
 
    public static void main(String args[])throws Exception{
 
        File f= new File("test.txt");
        WriteFiler fw= new WriteFiler(f);
        fw.write("Hello there");
        fw.close();
   
    }
}
