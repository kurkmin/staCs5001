import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UdpClientExample {
    public static void main(String[] args) throws IOException {

        // asks to type the message sent to server
        Scanner input = new Scanner(System.in);
        System.out.println("Type the text to be sent to the server: ");
        String msg = input.nextLine();

        // create a datagram socket (send)
        DatagramSocket s = new DatagramSocket();
        // encodes a message into a byte array
        byte[] out = msg.getBytes();
        // get the IP address of localhost
        InetAddress lh = InetAddress.getLocalHost();
        // create a datagram packet to send the message to the localhost port 8888
        DatagramPacket dpOut = new DatagramPacket(out, out.length, lh, 8888);
        // send a packet using Datagram socket
        s.send(dpOut);
    }
}
