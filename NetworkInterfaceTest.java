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
            }
        }catch (SocketException ex) {
                System.out.println();
        }
                // Handle exceptions
    }
}
