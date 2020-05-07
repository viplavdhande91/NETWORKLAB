import java.net.*;
import java.io.*;
import java.util.Scanner;  // Import the Scanner class
import java.util.*;

/*CLIENT CLASS*/
import java.text.ParseException;
import java.util.concurrent.TimeUnit;


import java.util.Arrays;

import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.IOException;
import java.text.MessageFormat;

import java.io.File;
import java.nio.file.*;


public class Server1 extends Thread {


    public void run() {

        try {


            Server myObja2a3 = new Server();
            int loopconditionvar = myObja2a3.NoofTimesS;

//file name sharing logic
                String dirPath = myObja2a3.serverfilesfolder;
                System.out.println("SERVER STARTED:READY TO SEND FILES");


                DatagramSocket socket = new DatagramSocket(7777);
                byte[] receiveData = new byte[1024];
                byte[] sendData = new byte[1024];


                int count = 5;

                File dir = new File(dirPath);
                String[] files = dir.list();
                byte buf1[] = new byte[1024];


                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);
                String sentence = new String(receivePacket.getData(), 0, receivePacket.getLength());
                // System.out.println("CLIENT SIDE FILES " + sentence);
                System.out.println("\n");


                sendData = (Arrays.toString(files)).getBytes();
                InetAddress clientIpAddress = receivePacket.getAddress();

                int clientPort = receivePacket.getPort();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientIpAddress, clientPort);
                socket.send(sendPacket);
                socket.close();

////////////////////////////  middle logic

            System.out.println("FILE TRANSFERRING STARTED....");



            for (int ij = 0; loopconditionvar > ij; ij++) {

                Random random = new Random();

//A2     

                   // int whileloopcount = 15;

                        DatagramSocket ds = new DatagramSocket(8787);
                        byte[] buf = new byte[1024];
                        DatagramPacket dp = new DatagramPacket(buf, 1024);
                        ds.receive(dp);
                        String choiceclient = new String(dp.getData(), 0, dp.getLength());
                        ds.close();


//A3                      
                        int seed = ij;
                        random.setSeed(seed);
                        int chance = random.nextInt(10);


                        if (((chance % 2) == 0)) {
                           // System.out.print(files[ij]);
                            String gfg2 = String.format("FROM CLIENT:ACKFLAG == 1,FILE" + " %s,PACKET SUCCESFULLY SENT WITH PRIORITY",files[ij]);
                            System.out.println(gfg2);

                            Thread.sleep(500);
                        } else {
                            System.out.println("FROM CLIENT:ACKFLAG == 0,FILE PACKET WAS DROPPED");
                            Thread.sleep(500);

                        }


                        byte b[] = new byte[1024 * 1000 * 50];  //51200000 Bytes = 48.828125 MB
                        FileInputStream f = new FileInputStream(dirPath + choiceclient);
                        byte[] arrayfile = Files.readAllBytes(Paths.get(dirPath + choiceclient));

                        DatagramSocket dsoc = new DatagramSocket();


                        dsoc.send(new DatagramPacket(arrayfile, arrayfile.length, InetAddress.getLocalHost(), 9797));

                        dsoc.close();

                       // whileloopcount++;




            }
        }
         catch (Exception e) {
            System.out.println("server1 exception: " + e);
           }




    }




}






//file  name sharing logic end
