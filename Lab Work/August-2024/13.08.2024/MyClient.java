import java.io.*;
import java.net.*;

public class MyClient {
    public static void main(String[] args) throws Exception {
        Socket soc = new Socket("localhost", 3333);
        DataInputStream din = new DataInputStream(soc.getInputStream());
        DataOutputStream dout = new DataOutputStream(soc.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = "", str2 = "";
        while (!str1.equals("stop")) {
            str1 = br.readLine();
            dout.writeUTF(str1);
            dout.flush();
            str2 = din.readUTF();
            System.out.println("Server says " + str2);
        }
        din.close();
        soc.close();
    }
}