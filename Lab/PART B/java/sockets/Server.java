import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
 
class Server {
 
    public static void main(String args[]) throws IOException {
 
        ServerSocket ss = new ServerSocket(3000);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        int num=din.readInt();
        //to find square
        int result=num*num;
        dout.writeInt(result);
        ss.close();
    }
 
}
