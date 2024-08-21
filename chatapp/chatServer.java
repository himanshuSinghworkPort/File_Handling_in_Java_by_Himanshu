import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class chatServer {
    public static void main(String[] args) throws IOException{
        ServerSocket ss=new ServerSocket(4444);
        Socket s=ss.accept();
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader((System.in)));
        String str=" ",str2=" ";
        while(!str.equals("stop")){
            str=din.readUTF();
            System.out.println("client says: "+str);
            str2=br.readLine();
            dout.writeUTF(str2);
            dout.flush();

        }
        din.close();
        dout.close();
        br.close();
    }
}
