import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
public class Client {

    public static void main(String[] args) throws IOException {
        // create a client socket to connect to a Server on "localhost" running port 12345
        Socket socket = new Socket("localhost", 12345);


        // reads a line from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Type the text to be sent to the server: ");
        String msg = input.nextLine();
        // sends the line to the user
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println(msg);

        // reads a line back from the server
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        BufferedReader in = new BufferedReader(isr);
        String res = in.readLine();
        System.out.println("Client: message replied from the server: " + res);

        // close the socket connection
        socket.close();
    }


}