
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ExDataServer {
    public static void main(String[] args) {
        try(ServerSocket ss = new ServerSocket(9000);
                Socket connetion = ss.accept();
                PrintWriter out = new PrintWriter(connetion.getOutputStream(),true); ){
            out.println("서버 > " + new Date().toString());
        }catch (Exception e){
        }
    }
}
