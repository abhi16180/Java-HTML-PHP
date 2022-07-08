import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuffer;

public class Palindrome {
    

    public static void main(String args[]) throws Exception{

        System.out.println("Enter a string");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        StringBuffer sb= new StringBuffer(s);
        if(s.equalsIgnoreCase(sb.reverse().toString())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }

    }
}
