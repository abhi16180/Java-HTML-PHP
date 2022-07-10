import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
class Client {
 
    public static void main(String args[]) throws IOException {
 
        Socket s = new Socket("localhost", 3000);
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeInt(n);
        int res=din.readInt();
        System.out.println("Square of "+n+" is "+res);
        s.close();
    }
 
}
