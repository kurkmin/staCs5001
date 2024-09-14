import java.net.Socket;
import java.net.ServerSocket;
import java.io.*;

public class Server {

    private ServerSocket ss;

    public Server(int port) {
        try {
            ss = new ServerSocket(port);
            System.out.println("Server started on port " + port);
            while (true) {
                // waits until client requests a connection, then returns connection (socket)
                Socket conn = ss.accept();
                System.out.println("Server got new connection request from " + conn.getInetAddress());

                // reads a line from the socket connection and prints the line
                InputStreamReader isr = new InputStreamReader(conn.getInputStream());
                BufferedReader in = new BufferedReader(isr);
                String req = in.readLine();
                System.out.println("message from the client: " + req);

                // send a responding line to the connected client
                PrintWriter out = new PrintWriter(conn.getOutputStream(), true);
                out.println("Echo: "  + req);

                // close the socket connection
                conn.close();

            }
        } catch (Exception ioe) {
            System.out.println("Error: " + ioe);
        }

    }
}

