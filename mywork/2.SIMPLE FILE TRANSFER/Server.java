import java.net.*;
import java.io.*;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
public class Server
{
            public static void main(String args[])throws IOException
            {
                        byte b[]=new byte[3072];
                        DatagramSocket dsoc=new DatagramSocket(1000);
                       // FileOutputStream f=new FileOutputStream("D:/nandha.txt");
                        while(true)
                        {
                                    DatagramPacket dp=new DatagramPacket(b,b.length);
                                    dsoc.receive(dp);
                                   // System.out.println();
                                    

                                    FileWriter myWriter = new FileWriter("D:/nandha.txt");
                                    myWriter.write(new String(dp.getData(),0,dp.getLength()));
                                    myWriter.close();                         

                        }
            }
}