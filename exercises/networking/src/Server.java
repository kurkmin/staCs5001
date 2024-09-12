import java.net.Socket;
import java.net.ServerSocket;
import java.io.*;
import java.io.InputStreamReader;

public class Server {

    public static void main(String[] args) throws IOException {
        // the TCP server socket runs/listens on port 12345
        ServerSocket ss = new ServerSocket(12345);
        System.out.println("Server: waiting for the client request...");
        // waits for an incoming connection request from client
        Socket conn = ss.accept();

//      // reads a line from the socket connection and prints the line
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        BufferedReader in = new BufferedReader(isr);
        String req = in.readLine();
        System.out.println(req);

        // send a responding line to the connected client
        PrintWriter out = new PrintWriter(conn.getOutputStream(), true);
        out.println("Echo: "  + req);

        // close the socket connection
        conn.close();
    }
}