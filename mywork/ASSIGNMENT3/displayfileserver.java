import java.io.*;
import java.net.*;
import java.util.*;

public class displayfileserver extends servermain
{
  public  void displayser() throws Exception
  {
     
      // String dirPath = "C:\\Users\\dell\\Desktop\\codes\\networklab\\Serverfolder\\";

      servermain displayfile = new servermain();
      String dirPath = displayfile.dirPathS;


      DatagramSocket socket = new DatagramSocket(9090);
            byte[] receiveData = new byte[1024];             
            byte[] sendData = new byte[1024];
            


            int count = 5;

              File dir = new File(dirPath);
              String[] files = dir.list();
              byte buf1[]=new byte[1024];
                


                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);
                String sentence = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("CLIENT SIDE FILES " + sentence);
                System.out.println("\n");


              
               sendData = (Arrays.toString(files)).getBytes();
                InetAddress clientIpAddress = receivePacket.getAddress();
                
                int clientPort = receivePacket.getPort();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientIpAddress, clientPort);
                socket.send(sendPacket);






  
         


    //}                    
                        }}