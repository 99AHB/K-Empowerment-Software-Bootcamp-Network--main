import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.*;

public class Day24 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = null;

        InetAddress names[] = InetAddress.getAllByName("www.naver.com");
        for(InetAddress element : names) {
            System.out.println(element);
        }
        try {
            address = InetAddress.getByName("www.packtpub.com");
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        displayInetAddressInformation(address);

    }

    private static void displayInetAddressInformation(InetAddress address) {
        System.out.println(address);
        System.out.println("CanonicalHostName: " + address.getCanonicalHostName());
        System.out.println("HostName: " + address.getHostName());
        System.out.println("HostAddress: " + address.getHostAddress());

    }
}
