import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args) throws Exception {
        ServerSocket servsoc = new ServerSocket(3333);
        Socket soc = servsoc.accept();
        DataInputStream din = new DataInputStream(soc.getInputStream());
        DataOutputStream dout = new DataOutputStream(soc.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = "", str2 = "";
        while (!str1.equals("stop")) {
            str1 = din.readUTF();
            System.out.println("Client says " + str1);
            str2 = br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }
        din.close();
        soc.close();
    }
}