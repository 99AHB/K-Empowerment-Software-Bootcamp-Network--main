import java.io.IOException;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Date;

public class Day22 {
    // Day24
    public static void main(String[] args) {
        System.out.println("NIO 타임 서버");
        try {
            ServerSocketChannel ssc = ServerSocketChannel.open();
            ssc.socket().bind(new InetSocketAddress(20000));
            while (true) {
                System.out.println("클라이언트 접속 대기중...");
                SocketChannel sc = ssc.accept();
                String dt;
                //if (sc != null) {
                dt = "날짜: " + new Date(System.currentTimeMillis());
                //}
                ByteBuffer buf = ByteBuffer.allocate(64);
                buf.put(dt.getBytes());
                buf.flip();
                while (buf.hasRemaining()) {
                    sc.write(buf);
                }
                System.out.println("전송됨: " + dt);
            }
        } catch (IOException ex) {
            System.out.println("입출력 예외 발생");
        }
    }
}
