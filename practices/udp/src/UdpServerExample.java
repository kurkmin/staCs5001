import java.io.IOException;
import java.net.*;

public class UdpServerExample {
    public static void main(String[] args) {
        try {
            // create a datagram socket (receive)
            DatagramSocket s = new DatagramSocket(8888);
            // assign the size of a byte array
            byte[] buf = new byte[66536];
            // create a datagram packet to receive a data from client
            DatagramPacket dpIn = new DatagramPacket(buf, buf.length);
            // receive a datagram packet from the client
            s.receive(dpIn);
            // get an IP address of the client
            InetAddress ip = dpIn.getAddress();
            // converts bytes to a string
            String msg = new String (dpIn.getData());
            System.out.println("The message received: " + msg + " from IP address: " + ip);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    }