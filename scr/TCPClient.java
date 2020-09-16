import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
    public final static String SERVER_IP = "127.0.0.1";
    public final static int SERVER_PORT = 6969;
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        try{
            Socket socket = new Socket(SERVER_IP,SERVER_PORT);

            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            byte[] data = new byte[0];
            System.in.read(data);
            os.write(data);
            is.read();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}