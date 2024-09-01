//import java.io.IOException;
//import java.net.ServerSocket;
//
//public class concurrentServerExample {
//    public static void main(String[] args) throws IOException {
//        ServerSocket server = new ServerSocket(8888);
//        while (true)  {
//            socket connection = server.accept();
//            ClientHandler ch = new ClientHandler(connection);
//            ch.start();
//        }
//    }
//}