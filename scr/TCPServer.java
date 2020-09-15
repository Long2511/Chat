import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;
import java.util.Scanner;

public class TCPServer {

    public static final int SERVER_PORT = 6969;

    public static void main(String[] args) {
        try {
            System.out.println("Binding to the port: " + SERVER_PORT);
            ServerSocket server = new ServerSocket(SERVER_PORT);
            System.out.println("Connected to port: " + SERVER_PORT);
            System.out.println("Waiting for client....");
        while (true){
            System.out.println("");
            Socket socket = server.accept();
            System.out.println("Client connected. Ready to exchange.");

            OutputStream os = socket.getOutputStream();
            InputStream is = socket.getInputStream();

            int ch = 0;
            while (true){
                ch = is.read();
                if (ch==-1){
                    break;
                }
                os.write(ch);
            }
            socket.close();
        }

        } catch (IOException e) {
            System.err.println("Connection error: "+ e);
        }
    }
}