import java.net.Socket;
import java.net.ServerSocket;
import java.io.*;
import java.io.InputStreamReader;

public class ServerSocketExample {

    public static void main(String[] args) throws IOException {
        // the TCP server socket runs/listens on port 8888
        ServerSocket ss = new ServerSocket(8888);
        System.out.println("Server: waiting for the client request...");
        // waits for an incoming connection from client
        Socket conn = ss.accept();


        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        BufferedReader in = new BufferedReader(isr);
        PrintWriter out = new PrintWriter(conn.getOutputStream(), true);

        String req = in.readLine();
        System.out.println("Server: message received from the client: "  + req);
        out.println("Pong");

        conn.close();
    }
}