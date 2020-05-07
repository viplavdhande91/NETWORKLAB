/*CLIENT CLASS*/
import java.net.*;
import java.io.*;
import java.util.Scanner;  // Import the Scanner class
import java.util.*;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;


import java.util.Calendar; 
import java.util.GregorianCalendar; 
import java.util.concurrent.*;



import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.File; 
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.text.MessageFormat;


import java.io.File;
import java.nio.file.*;



public class Client1  extends Thread {
	

public  void run(){

try{
          String dirPath = "C:\\Users\\dell\\Desktop\\clientfolder\\";

  DatagramSocket clientSocket = new DatagramSocket();
            byte[] sendData = new byte[1024];   //store outgoing data.    
            byte[] receiveData = new byte[1024];  //store incoming data    
            
    
         InetAddress serverAddress = InetAddress.getByName("10.0.2.15");

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



            stringReceiveData = stringReceiveData.replace("[","");
            stringReceiveData = stringReceiveData.replace("]","");

            stringReceiveData.trim();
            String[] arr = stringReceiveData.split(",");

            for(int xy = 0 ; xy<arr.length ;xy++)
            { 
                  arr[xy] =  arr[xy].trim();


            }

          Random random = new Random();

//A1                      
            int forloopcount = 15; 

            for(int x=0 ;x<arr.length ;x++){

                  String choiceclient  = arr[x];

                 InetAddress ip = InetAddress.getByName("10.0.2.15");  
                  DatagramSocket ds = new DatagramSocket();  
                  

                  DatagramPacket dp = new DatagramPacket(choiceclient.getBytes(), choiceclient.length(), ip, 3000);  
                  ds.send(dp);  
                  ds.close(); 
            


//A4
              String dirPathnewC = "C:\\Users\\dell\\Desktop\\clientfolder\\Serverfiles\\";

                   byte receiveData1[]=new byte[1024  * 500];
                   DatagramSocket dsoc=new DatagramSocket(1000);
                 
                   File file = new File(dirPathnewC + choiceclient);

                  OutputStream outee  = new FileOutputStream(file); 

                  

               try {
                     int counterwhile = 0;  

         
                  while(counterwhile  < 1)
                        {
                        DatagramPacket dpac=new DatagramPacket(receiveData1,receiveData1.length);
                        dsoc.receive(dpac);
                        //String words = new String(dpac.getData(),0,dpac.getLength(),"UTF-8"); 
                        
                        outee.write(receiveData1); 

                       // outee.write(words.getBytes());

                        counterwhile+=1;

                        }
                }
                catch (Exception e) {
                    System.out.println("Error while recieve in Client1: "+e);
                }

                 
                    dsoc.close();
            
                 
              int seed = forloopcount; 
               random.setSeed(seed);
              int chance = random.nextInt(10);
                 
            
                if( ((chance % 2) == 0) ){
               System.out.println("FROM SERVER:FILE PACKET RECIEVED ");
               Thread.sleep(500);
               }
               else{
                System.out.println("FROM SERVER:FILE PACKET WAS DROPPED");
                Thread.sleep(500);

               }


         forloopcount+=1;
        }  


//file name sharing logic end




} catch (Exception e) {
                    System.out.println("Error while recieve in Client1: "+e);
                }



}











}