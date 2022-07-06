
import java.io.*;

class ReadAndWrite {

    public static void main(String args[]) throws IOException {
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File("test.txt");
        if (!f.exists()) {
            f.createNewFile();
        }
        FileWriter fw = new FileWriter(f);
        System.out.println("Enter a line");
        line = br.readLine();
        fw.write(line);
        fw.close();
        br.close();

    }
}
