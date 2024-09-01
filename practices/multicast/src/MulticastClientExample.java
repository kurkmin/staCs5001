import java.io.IOException;
import java.net.*;

public class MulticastClientExample {
    public static void main(String[] args) {
        try {
            MulticastSocket ms = new MulticastSocket(9000);
            InetAddress group = InetAddress.getByName("228.5.6.7");
            ms.joinGroup(group);
            byte[] buf = new byte[65508];
            DatagramPacket recv = new DatagramPacket(buf, buf.length);
            while (true) {
                ms.receive(recv);
                String msg = new String(recv.getData(), 0, recv.getLength());
                System.out.println(msg);
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
