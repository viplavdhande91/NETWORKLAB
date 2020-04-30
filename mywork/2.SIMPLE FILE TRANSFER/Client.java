import java.net.*;
import java.io.*;
public class Client
{
            public static void main(String args[])throws Exception
            {         
                        byte b[]=new byte[1024];
                        FileInputStream f=new FileInputStream("C:\\Users\\dell\\Desktop\\codes\\networklab\\viplav.txt");
                        DatagramSocket dsoc=new DatagramSocket(2000);
                        int i=0;
                        while(f.available()!=0)
                        {
                                    b[i]=(byte)f.read();
                                    i++;
                        }                     
                        f.close();
                        dsoc.send(new DatagramPacket(b,i,InetAddress.getLocalHost(),1000));
            }

}