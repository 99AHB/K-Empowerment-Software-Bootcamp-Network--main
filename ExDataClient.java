import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class ExDataClient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try(Socket client = new Socket(serverAddress, 9000));
        BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));


    }
}
