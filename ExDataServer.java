import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ExDataServer {
    public static void main(String[] args) {
        try(ServerSocket ss = new ServerSocket(9000);
            Socket connetion = ss.accept();
            PrintWriter out = new PrintWriter(((Socket) connetion).getOutputStream(),true); ){
            out.println("서버 > " + new Date().toString());
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        }catch (Exception e){
    }
}
