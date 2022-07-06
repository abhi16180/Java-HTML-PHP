
//Read file disp with line number
import java.io.*;

class LineNum {
    public static void main(String args[]) {
        String thisline;

        try {
            LineNumberReader br = new LineNumberReader(new FileReader("test.txt"));
            while ((thisline = br.readLine()) != null) {
                System.out.println(br.getLineNumber() + "." + thisline);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("error:" + e);
        }
    }
}
