package Diablo;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;
public class NetworkInterfaceTest {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> interfaceEnum = NetworkInterface.getNetworkInterfaces();
            System.out.printf("이름      디스플레이 이름\n");
            for (NetworkInterface element : Collections.list(interfaceEnum)) {
                System.out.printf("%-8s %-32s\n", element.getName(), element.getDisplayName());
                Enumeration<InetAddress> addresses = element.getInetAddresses();
//                for (InetAddress inetAddress : Collections.list(addresses)) {
//                    System.out.printf(" InetAddress: %s\n", inetAddress);
//                }
                Collections
                        .list(addresses)
                        .stream()
                        .forEach(
                                (inetAddress -> {
                                    System.out.printf(" IP 주소 : %s\n", inetAddress);
                                } )
                        );
            }
        }catch (SocketException ex) {
                System.out.println();
        }
                // Handle exceptions
    }
}
