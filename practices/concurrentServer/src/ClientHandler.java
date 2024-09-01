//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.net.Socket;
//
//public class ClientHandler extends Thread{
//    public void run() {
//        Socket socket = new Socket("localhost", 8888);
//
//        // reader
//        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
//        BufferedReader in = new BufferedReader(isr);
//        // writer
//        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
//
//        // send the text to the connected server
//        out.println("Ping");
//        // read a responding line from the connected server
//        String res = in.readLine();
//        System.out.println("Client: message replied from the server: " + res);
//
//        // close the socket connection
//        socket.close();
//    }
//}
