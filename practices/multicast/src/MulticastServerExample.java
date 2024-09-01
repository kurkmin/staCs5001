import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class MulticastServerExample {
    public static void main(String[] args)  {
        try {
            MulticastSocket ms = new MulticastSocket();
            InetAddress group = InetAddress.getByName("228.5.6.7");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//            ms.joinGroup(group);

            while (true) {
                System.out.print("Type message: ");
                String msg = in.readLine();
                DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(), group, 9000);
                ms.send(dp);
            }

        } catch (IOException e) {
            e.getMessage();
        }
    }
}

