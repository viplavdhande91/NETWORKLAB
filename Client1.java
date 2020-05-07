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

import java.util.regex.*;


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

try {


   
    Client myObja1a4 = new Client();
    int loopconditionvar = myObja1a4.NoofTimesC;


        String dirPath = myObja1a4.clientfilesfolder;

        DatagramSocket clientSocket = new DatagramSocket();
        byte[] sendData = new byte[1024];   //store outgoing data.
        byte[] receiveData = new byte[1024];  //store incoming data


        InetAddress serverAddress = InetAddress.getByName("127.0.0.1");

        clientSocket.connect(serverAddress, 7777);

        File dir = new File(dirPath);
        String[] files = dir.list();
        byte buf2[] = new byte[1024];
        sendData = (Arrays.toString(files)).getBytes();

        // String stringSendData = "Hello Server!";
        //sendData = stringSendData.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 7777);
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


        stringReceiveData = stringReceiveData.replace("[", "");
        stringReceiveData = stringReceiveData.replace("]", "");

        stringReceiveData.trim();
        String[] arr = stringReceiveData.split(",");

        for (int xy = 0; xy < arr.length; xy++) {
            arr[xy] = arr[xy].trim();


        }

////////////////// PRIORITY LOGIC



    String[] newarrayxlsx = new String[arr.length]; ;
    String[] newarraytxt = new String[arr.length];
    String[] newarrayjpg = new String[arr.length];
    String[] newarrayjpeg= new String[arr.length] ;
    String[] newarraypng = new String[arr.length];
    String[] newarrayjfif= new String[arr.length] ;
    String[] newarrayhtml = new String[arr.length] ;
    String[] newarraycsv= new String[arr.length] ;




    for (int looppriovar=0;looppriovar<arr.length;looppriovar++){
        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();

        Date startDate = start.getTime();
         long startTime = startDate.getTime();



        Pattern pattern =Pattern.compile(".html");
        Matcher matcher =pattern.matcher(arr[looppriovar]) ;

        if(matcher.find())
        {
            newarrayhtml[looppriovar] =  arr[looppriovar];
        }



        pattern =Pattern.compile(".xlsx");
        matcher =pattern.matcher(arr[looppriovar]) ;

        if(matcher.find())
        {
            newarrayxlsx[looppriovar] =  arr[looppriovar];
        }


        pattern =Pattern.compile(".txt");
        matcher =pattern.matcher(arr[looppriovar]) ;

        if(matcher.find())
        {
            newarraytxt[looppriovar] =  arr[looppriovar];
        }



        pattern =Pattern.compile(".jpg");
        matcher =pattern.matcher(arr[looppriovar]) ;

        if(matcher.find())
        {
            newarrayjpg[looppriovar] =  arr[looppriovar];
        }



        pattern =Pattern.compile(".jpeg");
        matcher =pattern.matcher(arr[looppriovar]) ;

        if(matcher.find())
        {
            newarrayjpeg[looppriovar] =  arr[looppriovar];
        }


        pattern =Pattern.compile(".jfif");
        matcher =pattern.matcher(arr[looppriovar]) ;

        if(matcher.find())
        {
            newarrayjfif[looppriovar] =  arr[looppriovar];
        }




        pattern =Pattern.compile(".csv");
        matcher =pattern.matcher(arr[looppriovar]) ;

        if(matcher.find())
        {
            newarraycsv[looppriovar] =  arr[looppriovar];
        }

    }



//priority setting we set
    // csv html  "xlsx", ".txt", ".jpg",".jpeg",".png" ,".jfif"};



    ArrayList<String> list = new ArrayList<String>();

    // List list = new ArrayList(Arrays.asList(newarrayhtml));
    list.addAll(Arrays.asList(newarraycsv));

    list.addAll(Arrays.asList(newarrayhtml));

    list.addAll(Arrays.asList(newarrayxlsx));

    list.addAll(Arrays.asList(newarraytxt));

    list.addAll(Arrays.asList(newarrayjpg));

    list.addAll(Arrays.asList(newarrayjpeg));

    list.addAll(Arrays.asList(newarraypng));

    list.addAll(Arrays.asList(newarrayjfif));

    list.removeAll(Collections.singleton(null));


    String[] array = list.toArray(new String[list.size()]);

    /*for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
    } */


    /////////////////////////// PRIORITY LOGIC END
    for (int ij = 0; loopconditionvar > ij; ij++) {

         Calendar start = Calendar.getInstance();
                Calendar end = Calendar.getInstance();

                Date startDate = start.getTime();
                 long startTime = startDate.getTime();
        Random random = new Random();

//A1
       // int forloopcount = 15;

        //for (int x = 0; x < arr.length; x++) {

            String choiceclient = array[ij];
             int transfer2 = choiceclient.length();

        InetAddress ip = InetAddress.getByName("127.0.0.1");
            DatagramSocket ds = new DatagramSocket();


            DatagramPacket dp = new DatagramPacket(choiceclient.getBytes(), choiceclient.length(), ip, 8787);
            ds.send(dp);
            ds.close();


//A4
            String dirPathnewC = myObja1a4.clientDownloadFiles;

            byte receiveData1[] = new byte[1024 * 500];
        int recieve2 = receiveData1.length;


        DatagramSocket dsoc = new DatagramSocket(9797);

            File file = new File(dirPathnewC + choiceclient);

            OutputStream outee = new FileOutputStream(file);


            try {
                int counterwhile = 0;


                while (counterwhile < 1) {
                    DatagramPacket dpac = new DatagramPacket(receiveData1, receiveData1.length);
                    dsoc.receive(dpac);
                    //String words = new String(dpac.getData(),0,dpac.getLength(),"UTF-8");

                    outee.write(receiveData1);

                    // outee.write(words.getBytes());

                    counterwhile += 1;

                }




            } catch (Exception e) {
                System.out.println("Error while recieve in Client1: " + e);
            }


            dsoc.close();


            int seed = ij;
            random.setSeed(seed);
            int chance = random.nextInt(10);


            if (((chance % 2) == 0)) {
                System.out.println("FROM SERVER:FILE PACKET RECIEVED ");
                Thread.sleep(500);
            } else {
                System.out.println("FROM SERVER:FILE PACKET WAS DROPPED");
                Thread.sleep(500);

            }


      //  }
        //forloopcount += 1;


        Date endDate = end.getTime();
        long endTime = endDate.getTime();
         
       

        //LOG FILE CODE
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;

        // This block configure the logger with handler and formatter
        fh = new FileHandler("ClientLogFile.log");
        logger.addHandler(fh);

        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

       
                int transfer =0;
                transfer += transfer2 ;
                int recieve = 0;
                recieve += recieve2 ;



        long duration = (endTime - startTime);  //Total execution time in milli seconds

        String stringqwer = MessageFormat.format(" START TIME {0} || END TIME: {1}|| TRANSFERRED BYTES: {2}  || RECIEVED BYTES  : {3} || SOCKET_ACTIVE_TIME : {4}milliseconds|| CONNECTION_ATTEMPTS:{5}" ,startDate,endDate,transfer,recieve,duration,loopconditionvar);
        // the following statement is used to log any messages
        // String a ="ACTIVITY     || START TIME   || END TIME  ||  NoOfBytesTransffered || SOCKETTIME ";
        // logger.info(a);
        logger.info(stringqwer);



    }














}

//file name sharing logic end

catch (Exception e) {
                    System.out.println("Error while recieve in Client1: "+e);
                }



}









}