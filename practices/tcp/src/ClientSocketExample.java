import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class ClientSocketExample {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8888);

        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        BufferedReader in = new BufferedReader(isr);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        out.println("Ping");
        String res = in.readLine();
        System.out.println("Client: message replied from the server: " + res);

        socket.close();
    }


}
