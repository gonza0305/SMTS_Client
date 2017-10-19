import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Connect {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("46.101.3.244", 5000);
            PrintWriter out = new PrintWriter(client.getOutputStream());
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
