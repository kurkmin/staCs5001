import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
public class Client{
    private Socket s;
    public Client(int port) {
        try {
            s = new Socket("localhost", port);
            // reads a line from the user
            System.out.println("Type message: ");
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(isr);
            String msg = in.readLine();
            System.out.println(msg);
            // send the line to the server
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            out.println(msg);
            // reads a line back from the server, and prints it
            isr = new InputStreamReader(s.getInputStream());
            in = new BufferedReader(isr);
            msg = in.readLine();
            System.out.println(msg);

        } catch (IOException e) {
            e.getMessage();
        }
    }
}
