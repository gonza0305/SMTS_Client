import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("46.101.3.244", 5000);
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            BufferedReader sockIn = new BufferedReader(new InputStreamReader(client.getInputStream()));
            BufferedReader usrIn = new BufferedReader(new InputStreamReader(System.in));
            String usrInput;
            while((usrInput = usrIn.readLine()) != null){
                out.println(usrInput);
                System.out.println("Socket:" + sockIn.readLine());
            }
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
