
//count number of lines ,words and chars
import java.io.*;
class ReadFile

{

    public static void main(String args[]) {
        int line = 0, word = 0, charCount = 0;
        File f = new File("t.txt");

        try {
            BufferedReader b = new BufferedReader(new FileReader(f));

            String s = b.readLine();

            while (s != null) {
                line++;
                word += (s.split(" ")).length;
                charCount += s.length();
                s = b.readLine();

            }

            System.out.println("Lineas " + line + "\nWords " + word + "\nChars" + charCount);
        } catch (Exception e) {
            System.out.println("Error");

        }
    }

}
