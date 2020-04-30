import java.io.*;
import java.net.*;
import java.util.*;

public class displayfileclient extends clientmain
{
  public void displaycli()  throws Exception
  {
          clientmain displayfile = new clientmain();
          String dirPath = displayfile.dirPathC;




            DatagramSocket clientSocket = new DatagramSocket();
            byte[] sendData = new byte[1024];   //store outgoing data.    
            byte[] receiveData = new byte[1024];  //store incoming data    
            
    
         InetAddress serverAddress = InetAddress.getByName("127.0.0.1");

          clientSocket.connect(serverAddress,9090); 

            File dir = new File(dirPath);
            String[] files = dir.list();
            byte buf2[]=new byte[1024];
            sendData = (Arrays.toString(files)).getBytes();
            
           // String stringSendData = "Hello Server!";
            //sendData = stringSendData.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 9090);
            clientSocket.send(sendPacket);
            //System.out.println("...packet sent successfully...."); 




            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);
          // System.out.println("Received packet data : " +  Arrays.toString(receivePacket.getData()));
           // receiveData = receivePacket.getData();
            String stringReceiveData = new String(receivePacket.getData(), 0, receivePacket.getLength());
            clientSocket.close();
            System.out.println("SERVER SIDE FILES: " + stringReceiveData);
            System.out.println("\n");


       




 
 






    }                    
}                        